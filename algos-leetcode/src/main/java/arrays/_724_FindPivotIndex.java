/*
 * Developed by GSK on 5/6/19 1:29 AM.
 * Last Modified 5/6/19 1:28 AM.
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

/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 *
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 *
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 *
 * Example 1:
 *
 * Input:
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation:
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 *
 *
 * Example 2:
 *
 * Input:
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 *
 *
 * Note:
 *
 * The length of nums will be in the range [0, 10000].
 * Each element nums[i] will be an integer in the range [-1000, 1000].
 */
public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        return approach_2_LeftSum_RightSum(nums);
    }

    private int approach_2_LeftSum_RightSum(int[] nums){
        /**
         *  At the Pivot Index, Left Sum == RightSum..
         *  S - Total sum of all elements in Array.
         *  L - Left Sum, R - Right Sum, P - Value @ Pivot Index
         *  S = L + R + P
         *
         *  L = S - R - P; // Since LeftSum==RightSum at Pivot Index,
         *  L = S - L - P;
         *  So now we can calculate Left sum from 0th towards N until we find pivot
         */

        if(nums.length == 0){
            return -1;
        }
        // compute Total Sum of all elements
        int sum=0;
        for(int val: nums){
            sum+=val;
        }
        int leftSum = nums[0]; // Start with LeftSum = 0th Element.
        for(int pivotIndex=1; pivotIndex<nums.length;pivotIndex++){
            if(leftSum == sum-leftSum-nums[pivotIndex]){
                return pivotIndex;
            }
        }
        return -1;
    }


    // Using two loops. consider 1st element as PivotIndex and compute if LeftSum=RightSum... Continue from 1 to N-1
    // Complexity O(n^2)
    private int approach_1_TwoLoops(int[] nums){
        for(int pivotIndex=1; pivotIndex<nums.length;pivotIndex++){
            // compute Left sum, 0th to PivotIndex
            int leftSum=Integer.MIN_VALUE;
            for(int leftIndex=0; leftIndex<pivotIndex;leftIndex++){
                leftSum+=nums[leftIndex];
            }
            int rightSum=Integer.MIN_VALUE;
            for(int rightIndex=pivotIndex+1;rightIndex<nums.length;rightIndex++){
                rightSum+=nums[rightIndex];
            }
            if(leftSum == rightSum){
                return pivotIndex;
            }
        }
        return -1;
    }
}
