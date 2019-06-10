/*
 *  Developed by GSK on 5/14/19 2:56 PM
 *  Last Modified 5/14/19 2:56 PM.
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

package tree._114_FlattenBTToLinkedList;

import tree.TreeNode;
import tree.TreeNodeUtil;

import java.net.HttpURLConnection;
import java.net.URL;


public class _114_FlattenBTToLinkedList {
    public void flatten(TreeNode root) {

    }

    private void recurse(TreeNode node){
        if(node == null){
            return;
        }
        if(node.left != null){
            recurse(node.left);
        }
        System.out.print(node.val+",");
        if(node.right != null){
            recurse(node.right);
        }
    }


    public static void main(String[] args) {
        TreeNode root = TreeNodeUtil.constructSampleBT_Three();
        _114_FlattenBTToLinkedList flattenBTToLinkedList = new _114_FlattenBTToLinkedList();
        flattenBTToLinkedList.flatten(root);

        /*
        while (root != null){
            System.out.println(root.val);
            root = root.right;
        }
        */


    }
}
