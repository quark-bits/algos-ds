/*
 * Developed by GSK on 5/6/19 2:30 PM.
 * Last Modified 5/6/19 2:30 PM.
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

package arrays;

/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Your algorithm should run in O(n) complexity.

Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/

/*
    Approach-1: Sorting and then finding the length
        Sorting takes N Log(N) complexity

    Approach-2:
        Put the values in a Set. then for each value in array, find if there exists a consecutive value.
        // Assumption: There are no duplicates. if we have duplicates, then we need to add to Map and then use the value to keep track of duplicate counts.
*/

import java.util.HashSet;
import java.util.Set;

public class _128_LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveSet = new HashSet<>(nums.length);
        for(int num: nums) {
            consecutiveSet.add(num);
        }
        int longestConsecutive=0;

        for(int i=0; i<nums.length;i++){
            // if set contains previous consecutive element, skip it for now. Later inside while loop we'll consider this element when previous element is encountered.
            // this will reduce number of repeated calls
            if(!consecutiveSet.contains(nums[i] -1)){
                int next = nums[i]+1;
                int currentConsecutive = 1;
                while(consecutiveSet.contains(next)){
                    currentConsecutive+=1;
                    next+=1;
                }
                if(currentConsecutive>longestConsecutive){
                    longestConsecutive=currentConsecutive;
                }
            }
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Result="+result);
    }
}
