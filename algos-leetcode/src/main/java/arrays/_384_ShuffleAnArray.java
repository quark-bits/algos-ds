/*
 * Developed by GSK on 5/6/19 1:29 AM.
 * Last Modified 5/4/19 10:39 PM.
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

import utils.SysOutUtil;

import java.util.*;

/**
 * Shuffle a set of numbers without duplicates.
 *
 * Example:
 *
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 *
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 *
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 */
public class _384_ShuffleAnArray {
    int[] shuffle;
    int[] original;
    Random random = new Random();

    public _384_ShuffleAnArray(int[] nums) {
        shuffle = nums;
        original = Arrays.copyOf(nums,nums.length); // Copy of Original input
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0; i<shuffle.length;i++){
            swap(shuffle,i,randomIdx(shuffle));
        }
        return shuffle;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int randomIdx(int[] nums){
        int randomIdx = random.nextInt(nums.length - 1);
        return randomIdx;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,1,6,8,9};
        _384_ShuffleAnArray obj = new _384_ShuffleAnArray(nums);
        int[] param_2 = obj.shuffle();
        SysOutUtil.displayIntArray(param_2);
        System.out.println();
        int[] param_1 = obj.reset();
        SysOutUtil.displayIntArray(param_1);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution_384 obj = new Solution_384(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */