/*
 * Developed by GSK on 5/7/19 4:01 PM.
 * Last Modified 4/28/19 8:50 PM.
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


import java.util.*;

/**
 *  InOrder: Left - Node - Right
 */
public class InOrderTraverse {
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

        System.out.println("RECURSIVE");
        inOrderRecursive(node1);
        System.out.println();

        System.out.println("ITERATIVE");
        inOrderIterative(node1);
        System.out.println();

        System.out.println("ITERATIVE_ExtraVisitedStack");
        inOrderIterativeUsingExtraStack(node1);
    }


    static void inOrderRecursive(Node node){
        if(node.left != null){
            inOrderRecursive(node.left);
        }
        System.out.print(node.value+"->");
        if(node.right != null){
            inOrderRecursive(node.right);
        }
    }

    static void inOrderIterative(Node node){
        Node current = node;
        Stack<Node> nodeStack = new Stack<>();


        while(current != null || !nodeStack.isEmpty()){
            if(current != null){
                nodeStack.add(current);
                current = current.left;
            }
            else{
                current = nodeStack.pop();
                System.out.print(current.value+"=>");
                current=current.right;
            }
        }
    }

    static void inOrderIterativeUsingExtraStack(Node node){
        Stack<Node> nodeStack= new Stack<>();
        Set<Node> visitedNodeSet = new HashSet<>();
        nodeStack.push(node);

        while(!nodeStack.isEmpty()){
            Node t = nodeStack.pop();
            if(visitedNodeSet.contains(t)){
                System.out.print(t.value+"-->");
            }
            else{
                if(t.right != null){
                    nodeStack.push(t.right);
                }
                nodeStack.push(t);
                if(t.left !=null){
                    nodeStack.push(t.left);
                }
                visitedNodeSet.add(t);
            }
        }
    }
}
