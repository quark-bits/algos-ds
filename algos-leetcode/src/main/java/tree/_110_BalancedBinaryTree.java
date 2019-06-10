/*
 *  Developed by GSK on 5/10/19 1:33 PM
 *  Last Modified 5/10/19 1:33 PM.
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

/*
  PROBLEM:

  Given a binary tree, determine if it is height-balanced.

  For this problem, a height-balanced binary tree is defined as:

  a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

  Example 1:

  Given the following tree [3,9,20,null,null,15,7]:

      3
     / \
    9  20
      /  \
     15   7
  Return true.

  Example 2:

  Given the following tree [1,2,2,3,3,null,null,4,4]:

         1
        / \
       2   2
      / \
     3   3
    / \
   4   4
  Return false.

 */


/*
  SOLUTION:
  Find Depth of SubTree at every level and compare the Depth
= */
package tree;

import java.util.concurrent.atomic.AtomicBoolean;

public class _110_BalancedBinaryTree {


    public boolean isBalanced(TreeNode root) {
            BalancedStatusWithHeight result = isBalancedWithHeight(root);
            return result.balanced;
    }


    private static BalancedStatusWithHeight isBalancedWithHeight(TreeNode node){
       if(node == null){
           return new BalancedStatusWithHeight(Boolean.TRUE,-1);
       }

       BalancedStatusWithHeight leftSubTree = isBalancedWithHeight(node.left);
       if(!leftSubTree.balanced){
            return leftSubTree; // Left SubTree Not Balanced.
       }
       BalancedStatusWithHeight rigthSubTree = isBalancedWithHeight(node.right);
        if(!rigthSubTree.balanced){
            return rigthSubTree; // Right SubTree Not Balanced.
        }

        boolean balanced = Math.abs(leftSubTree.height - rigthSubTree.height) <= 1;
        int height = Math.max(leftSubTree.height,rigthSubTree.height)+1;
        return new BalancedStatusWithHeight(balanced,height);
    }


    static class BalancedStatusWithHeight{
        boolean balanced;
        int height;

        public BalancedStatusWithHeight(boolean balanced, int height) {
            this.balanced = balanced;
            this.height = height;
        }
    }




    public static void main(String[] args) {
        /**
         * Given the following tree [3,9,20,null,null,15,7]:
         *
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         * Return true.
         */

        TreeNode root = new TreeNode(3);

        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        root.left=node9;
        root.right=node20;

        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node20.left=node15;
        node20.right=node7;

        _110_BalancedBinaryTree balancedBinaryTree = new _110_BalancedBinaryTree();
        boolean result = balancedBinaryTree.isBalanced(root);
        System.out.println("Result="+result);

    }
}


