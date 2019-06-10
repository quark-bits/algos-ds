package tree;

/*
    Note: Access-Modifiers for member variables should be public and access should be through Getter-Setter.
    Here its made public for ease of testing with LeetCode platform.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    // Constructor.
    TreeNode(int x) { val = x; }
}