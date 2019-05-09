/*
 * Developed by GSK on 5/7/19 4:00 PM.
 * Last Modified 4/28/19 9:01 PM.
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

package tree.binary;

import java.util.Stack;

/**
 *  Pre-Order: Node -> Left -> Right
 */
public class PreOrderTraverse {
    public static void main(String[] args){

        /*

                     1
                   /   \
                  2     5
                 / \   / \
                3  4   6  7

              output: 1-2-3-4-5-6-7
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

        System.out.println("RECURSIVE");
        preOrderRecursive(node1);
        System.out.println();

        System.out.println("ITERATIVE");
        preOrderIterative(node1);
    }

    static void preOrderRecursive(Node node){
        System.out.print(node.value+"->");
        if(node.left != null){
            preOrderRecursive(node.left);
        }
        if(node.right != null){
            preOrderRecursive(node.right);
        }
    }

    static void preOrderIterative(Node node){
        Stack<Node> nodeStack =  new Stack<>();
        nodeStack.push(node);
        while(!nodeStack.empty()){
            Node n = nodeStack.pop();
            System.out.print(n.value+"-->");
            if(n.right != null){
                nodeStack.push(n.right);
            }
            if(n.left != null){
                nodeStack.push(n.left);
            }
        }
    }
}
