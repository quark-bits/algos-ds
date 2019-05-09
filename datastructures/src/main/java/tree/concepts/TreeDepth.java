/*
 * Developed by GSK on 5/7/19 4:02 PM.
 * Last Modified 5/7/19 4:02 PM.
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

package tree.concepts;

/**
 * The depth of a node is the number of edges from the node to the tree's root node.
 * A root node will have a depth of 0.
 *
 * The height of a node is the number of edges on the longest path from the node to a leaf.
 * A leaf node will have a height of 0.
 *
 */
public class TreeDepth {
    static void findDepth(){

    }

    public static void main(String[] args){

        /*

                     1
                   /   \
                  2     5
                 / \   / \
                3  4   6  7

              output: 3-2-4-1-6-5-7
         */
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left=node2;
        node1.right=node5;

        node2.left=node3;
        node2.right=node4;

        node5.left=node6;
        node5.right=node7;

    }
}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}