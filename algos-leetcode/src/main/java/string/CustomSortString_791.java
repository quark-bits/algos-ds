/*
 * Developed by GSK on 5/6/19 1:23 AM.
 * Last Modified 5/4/19 10:57 AM.
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

import java.util.Arrays;
import java.util.Comparator;

/**
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.
 *
 * S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.
 *
 * Return any permutation of T (as a string) that satisfies this property.
 *
 * Example :
 * Input:
 * S = "cba"
 * T = "abcd"
 * Output: "cbad"
 * Explanation:
 * "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
 * Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
 *
 *
 * Note:
 *
 * S has length at most 26, and no character is repeated in S.
 * T has length at most 200.
 * S and T consist of lowercase letters only.
 *
 */


/**
 * Solution:
 *
 * Approach-1:
 * Create custom comparator based on values in S array.
 * Sort the elements in T array using custom comparator.
 *
 *
 */


public class CustomSortString_791 {
    public String customSortString(String S, String T) {
        return approach1_using_CustomComparator(S,T);
    }

    //--------------------------------- Approach 1 ----------------------------------------
    private String approach1_using_CustomComparator(String S, String T){
        Character[] TCharacters = charToCharacterArray(T.toCharArray());
        CustomCharComparator customCharComparator = new CustomCharComparator(S.toCharArray());
        Arrays.sort(TCharacters,customCharComparator);
        return new String(characterToCharArray(TCharacters));
    }
    private Character[] charToCharacterArray(char[] chars){
        Character[] characters = new Character[chars.length];
        for(int i=0;i<chars.length;i++){
            characters[i] = Character.valueOf(chars[i]);
        }
        return characters;
    }

    private char[] characterToCharArray(Character[] characters){
        char[] chars = new char[characters.length];
        for(int i=0;i<chars.length;i++){
            chars[i] = characters[i];
        }
        return chars;
    }

    //--------------------------------- Approach 2 ----------------------------------------

}

class CustomCharComparator implements Comparator<Character> {
    char[] order; // Store the Order.

    public CustomCharComparator(char[] order) {
        this.order = order;
    }

    @Override
    public int compare(Character char1, Character char2) {
        // Both characters are same, return 0
        if(char1.charValue() == char2.charValue()){
            return 0;
        }
        int char1Index = findIndex(char1);
        int char2Index = findIndex(char2);
        if(char1Index >= 0 && char2Index >= 0){
            return char1Index < char2Index ? -1: 1;
        }
        // char1 exists in S and char2 doesn't,then char1 should come first.
        if(char1Index >=0 && char2Index == -1){
            return -1;
        }
        else if(char1Index == -1 && char2Index >=0){
            return 1;
        }
        else{
            return 0;
        }
    }

    private int findIndex(char target){
        int index=-1;
        for(int i=0;i<order.length;i++){
            if(order[i] == target){
                index=i;
            }
        }
        return index;
    }
}