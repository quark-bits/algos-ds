/*
 *  Developed by GSK on 5/10/19 3:52 PM
 *  Last Modified 5/10/19 3:52 PM.
 *  Copyright (c) 2019.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 */

public class _102_BTLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();

        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            System.out.println(node.val);
            if(node.left != null){
                nodeQueue.add(node.left);
            }
            if(node.right != null){
                nodeQueue.add(node.right);
            }
        }
        return level;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNodeUtil.constructSampleBT_Two();
        List<List<Integer>> levels = levelOrder(root);
        levels.forEach(level -> {
            level.stream().forEach(nodeVal -> System.out.println(nodeVal) );
        });
    }
}
