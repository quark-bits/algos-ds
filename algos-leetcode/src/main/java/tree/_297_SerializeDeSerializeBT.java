/*
 * Developed by GSK on 5/9/19 11:16 PM.
 * Last Modified 5/9/19 11:16 PM.
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

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Example:
 *
 * You may serialize the following tree:
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]"
 * Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 *
 */


import utils.SysOutUtil;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Approach_1:
 * Treat this as Full Binary Tree and use Array to represent the Values.
 *
 * So for every element at ith Index in the array, left=2i+1 and right=2i+2
 *
 *
 */

public class _297_SerializeDeSerializeBT {
    private final static String NULL = "NULL";
    private final static String SEPARATOR = ",";
    static String test = "test";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return null;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }

    private void preOrderTraverse(StringBuilder nodeBuilder, TreeNode node){
        if(node == null){
            nodeBuilder.append(NULL).append(SEPARATOR);
            return;
        }
        nodeBuilder.append(node.val).append(SEPARATOR);
        preOrderTraverse(nodeBuilder,node.left);
        preOrderTraverse(nodeBuilder,node.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left=node2;
        root.right=node3;

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node3.left=node4;
        node3.right=node5;

        // Your _297_SerializeDeSerializeBT object will be instantiated and called as such:
        _297_SerializeDeSerializeBT codec = new _297_SerializeDeSerializeBT();
        String serializedTree = codec.serialize(root);
        System.out.printf("SerializedTree="+serializedTree);

        TreeNode treeNode = codec.deserialize(serializedTree);
    }

}


