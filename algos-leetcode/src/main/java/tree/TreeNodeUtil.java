/*
  Developed by GSK on 5/10/19 3:53 PM
  Last Modified 5/10/19 3:53 PM.
  Copyright (c) 2019.
 *
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
 *
      http://www.apache.org/licenses/LICENSE-2.0
 *
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 *
 */

package tree;

public class TreeNodeUtil {

    /**
     *
     * Construct binary tree [3,9,20,null,null,15,7],
     *
     *                 3
     *                / \
     *               9  20
     *                 /  \
     *                15   7
     *
     * @return treeNode
     */
    public static TreeNode constructSampleBT(){
        TreeNode root = new TreeNode(3);

        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        root.left=node9;
        root.right=node20;

        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node20.left=node15;
        node20.right=node7;
        return  root;
    }


    /**
     *
     * Construct binary tree [3,9,20,null,null,15,7],
     *
     *                 3
     *                / \
     *               9  20
     *              /  /  \
     *            10  15   7
     *                    / \
     *                   8  12
     *
     * @return treeNode
     */
    public static TreeNode constructSampleBT_Two(){
        TreeNode root = new TreeNode(3);

        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        root.left=node9;
        root.right=node20;

        TreeNode node10 = new TreeNode(10);
        node9.left=node10;

        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node20.left=node15;
        node20.right=node7;

        TreeNode node8 = new TreeNode(8);
        TreeNode node12 = new TreeNode(12);
        node7.left=node8;
        node7.right=node12;
        return  root;
    }


    /**
     *
     *
     *         1
     *        / \
     *       2   5
     *      / \   \
     *     3   4   6
     *
     */

    public static TreeNode constructSampleBT_Three(){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node2.left = node3;
        node2.right = node4;

        node5.right=node6;
        root.left=node2;
        root.right=node5;
        return  root;
    }
}
