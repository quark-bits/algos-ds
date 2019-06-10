/*
 *  Developed by GSK on 5/20/19 3:32 PM
 *  Last Modified 5/10/19 3:56 PM.
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

package tree._104_MaxDepthOfBT;

import tree.TreeNode;
import tree.TreeNodeUtil;

public class _104_MaxDepthOfBT {
    public int maxDepth(TreeNode root) {
        return maxDepth_Recursive(root);

    }

    /**
     * Approach_1: Recursively find Max Depth at each node
     *
     */
    private int maxDepth_Recursive(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }

    /**
     * Approach_2: Iteratively find Max Depth at each node
     *
     */
    private int maxDepth_Iterative(TreeNode node){
        //TODO:
        return 0;
    }


    public static void main(String[] args) {
        TreeNode root = TreeNodeUtil.constructSampleBT();
        _104_MaxDepthOfBT maxDepthOfBT = new _104_MaxDepthOfBT();
        int result = maxDepthOfBT.maxDepth(root);
        System.out.println("Result-MaxDepth=="+result);
    }
}
