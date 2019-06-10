/*
 *  Developed by GSK on 5/14/19 12:05 PM
 *  Last Modified 5/14/19 12:05 PM.
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

package tree._94_BTInorderTraversal;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class _94_BTInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        /*
        List<Integer> result = new ArrayList<>();
        inorderRecursive(result,root);
        return result;
        */
        return inorderIterative(root);
    }

    private void inorderRecursive(List<Integer> nodeValues, TreeNode node){
        if(node != null){
            if(node.left != null){
                inorderRecursive(nodeValues,node.left);
            }
            nodeValues.add(node.val);
            if(node.right != null){
                inorderRecursive(nodeValues,node.right);
            }
        }
    }

    private List<Integer> inorderIterative(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode current = root;    // Set root as currentNode

        while(current!= null || !nodeStack.isEmpty()){
            while(current != null){
                nodeStack.push(current);
                current = current.left;
            }

            TreeNode node = nodeStack.pop();
            result.add(node.val);
            current=node.right;
        }
        return result;
    }
}
