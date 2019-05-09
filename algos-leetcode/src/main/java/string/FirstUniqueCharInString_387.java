/*
 * Developed by GSK on 5/6/19 1:29 AM.
 * Last Modified 5/4/19 6:49 PM.
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

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharInString_387 {
    public static int firstUniqChar(String s) {
        // ---------------- Approach 1 --------------------------
        return approach1_brute_force(s);
    }

    // ---------------- Approach 2 (Using Map to track char occurrence count)  --------------------------
    private static int approach2_track_count_with_map(String s){
        Map<Character,Integer> sMap = new HashMap<>();

        // Add all chars to Map along with count of occurrences.
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i)+1));
            }else{
                sMap.put(s.charAt(i),1);
            }
        }

        // Iterate through the chars in S and check for the first character with count=1 in the Map
        for(int i=0; i<s.length();i++){
            if(sMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    // ---------------- Approach 1 (Brute Force) ----------------------------------------------------
    private static int approach1_brute_force(String s){
        boolean isUnique=true;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            isUnique=true;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i] == chars[j]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                return i;
            }
        }
        return -1;
    }

}
