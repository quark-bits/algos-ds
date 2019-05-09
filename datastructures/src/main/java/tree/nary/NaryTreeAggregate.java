/*
 * Developed by GSK on 5/7/19 3:59 PM.
 * Last Modified 4/26/19 12:48 PM.
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

package tree.nary;

import java.util.List;
import java.util.Stack;


/**
 * Aggregate value of Node to its Parent
 *
 * E.g
 *                A(4)
 *              /  |   \
 *            /    |     \
 *           B(6)  C(2)   D(3)
 *         / \           /   \
 *      E(3)  F(2)      G(4)  H(5)
 *
 *    The values in the bracket() are the existing score values of each node.
 *
 *    Aggregate values to parent such that the parent score will be sum of existing value + child scores.
 *    E.g score for B --> 6(oldvalue) + 3(E's value) + 2(F's value) = 11
 *    similarly calculate for each Parent node
 *
 *
 */
public class NaryTreeAggregate {
    Stack<Integer> addStack = new Stack<>(); // use stack to store the Node values when we traverse each node.

    public void traversePostOrderRecursive(Node node){
        if(node != null){
            List<Node> children = node.children;
            if(!children.isEmpty()){
                for(Node child:node.children){
                    traversePostOrderRecursive(child);
                }
                // After traversing all children of a node, get the sum of values and add it up to Parent value
                int sum=0;
                while(!addStack.isEmpty()){
                    sum+=addStack.pop();
                }
                node.val=node.val+sum;
            }
            addStack.push(node.val);
        }
    }
}
