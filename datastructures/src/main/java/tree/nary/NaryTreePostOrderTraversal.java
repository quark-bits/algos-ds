package tree.nary;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 *
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 */
public class NaryTreePostOrderTraversal {
    private List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        traversePostOrderRecursive(root);
        return result;
    }

    private void traversePostOrderRecursive(Node node){
        if(node != null){
            List<Node> children = node.children;
            if(!children.isEmpty()){
                for(Node child:node.children){
                    traversePostOrderRecursive(child);
                }
            }
            result.add(node.val);
        }
    }
}

