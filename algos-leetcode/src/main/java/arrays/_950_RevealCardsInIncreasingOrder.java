/*
 * Developed by GSK on 5/6/19 1:39 AM.
 * Last Modified 5/6/19 1:39 AM.
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

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * In a deck of cards, every card has a unique integer.  You can order the deck in any order you want.
 *
 * Initially, all the cards start face down (unrevealed) in one deck.
 *
 * Now, you do the following steps repeatedly, until all cards are revealed:
 *
 * Take the top card of the deck, reveal it, and take it out of the deck.
 * If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
 * If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
 * Return an ordering of the deck that would reveal the cards in increasing order.
 *
 * The first entry in the answer is considered to be the top of the deck.
 *
 *
 *
 * Example 1:
 *
 * Input: [17,13,11,2,3,5,7]
 * Output: [2,13,3,11,5,17,7]
 * Explanation:
 * We get the deck in the order [17,13,11,2,3,5,7] (this order doesn't matter), and reorder it.
 * After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
 * We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
 * We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
 * We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
 * We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
 * We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
 * We reveal 13, and move 17 to the bottom.  The deck is now [17].
 * We reveal 17.
 * Since all the cards revealed are in increasing order, the answer is correct.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 1000
 * 1 <= A[i] <= 10^6
 * A[i] != A[j] for all i != j
 */


/**
 * Approach:
 *
 * 1. Since all cards are to revealed in increasing order, sort the given array
 * 2. Top card is alternatively revealed and put back to the bottom of the deck
 * 3.
 * 4.
 *
 */
public class _950_RevealCardsInIncreasingOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length]; // Result Array

        // Sort the Given Array.
        Arrays.sort(deck); // Now we've the elements in increasing order

        // Now we need to position these elements for retrieval
        Queue<Integer> deckRevealIndexQueue = new ArrayDeque<>();
        for(int i=0; i<deck.length;i++){
            // Fill Queue with the index 0 to N-1
            deckRevealIndexQueue.add(i);
        }

        for (int card: deck){
            //pick each card and place it in resultant array based on how its retrieved

            // pick top card and put it in the resultant array
            result[deckRevealIndexQueue.poll()] = card;

            // push next top card onto Bottom of Queue.
            if(!deckRevealIndexQueue.isEmpty()){
                deckRevealIndexQueue.add(deckRevealIndexQueue.poll());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{17,13,11,2,3,5,7};
        int[] result = deckRevealedIncreasing(nums);
        SysOutUtil.displayIntArray(result);
    }
}
