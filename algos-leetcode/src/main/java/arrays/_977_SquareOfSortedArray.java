/*
 * Developed by GSK on 5/6/19 1:29 AM.
 * Last Modified 5/4/19 10:08 AM.
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

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 *
 */
public class _977_SquareOfSortedArray {
    public int[] sortedSquares(int[] A) {
        // Since square of negative number will be always positive..
        // Option-1: convert to absolute value, sort and then square.

        // Option-2: Square the number and then sort.
        for(int i=0; i< A.length; i++){
            A[i]*=A[i];
        }

        // sort the array in ascending order.
        // TODO: Implement Sorting.
        Arrays.sort(A);
        return A;
    }
}
