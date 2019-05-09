/*
 * Developed by GSK on 5/8/19 10:56 AM.
 * Last Modified 5/8/19 10:56 AM.
 * Copyright (c) 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package string;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord_058 {

    public static int lengthOfLastWord(String s) {
        // if input is null, return 0
        if(s == null){
            return 0;
        }
        // if input has only whitespaces, then return 0
        s=s.trim();
        if(s.length() == 0){
            return 0;
        }

        int n = s.length()-1;   // Length of the string after trimming whitespaces.
        int lastWordLength=0;   // Track length of lastword.

        for(int i=n; i>=0; i--){
            if(s.charAt(i) == ' '){
                lastWordLength=n-i;
                break;
            }
        }
        if(lastWordLength == 0){    // if the input had only one word, then return the word length.
            lastWordLength=s.length();
        }
        return lastWordLength;
    }

    public static void main(String[] args){
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("Result="+result);
    }
}

