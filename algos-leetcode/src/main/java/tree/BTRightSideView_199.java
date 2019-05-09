/*
 * Developed by GSK on 5/7/19 2:29 PM.
 * Last Modified 5/7/19 2:29 PM.
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

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 *
 * Example:
 *
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 *
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 *
 */
public class BTRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        // Do Level Ordering and get the rightMost elements.
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.add(root);

        while (!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            result.add(node.val);
            if(node.right != null)
                nodeStack.push(node.right);
            if(node.left != null)
                nodeStack.push(node.left);
        }


        return result;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}