## Problem

    Given a binary tree, find its maximum depth.
    
    The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    
    Note: A leaf is a node with no children.
    
    Example:
    
    Given binary tree [3,9,20,null,null,15,7],
    
        3
       / \
      9  20
        /  \
       15   7
    return its depth = 3.

## Solution

#### Recursive Approach:
Recursive approach is straightforward.

    MaxDepth_Recursive(Node):
        if(node is null) // Base Case
            return 0
        Call MaxDepth_Recursive(Node.LEFT)        
        Call MaxDepth_Recursive(Node.RIGHT)
        Return Max(MAX_DEPTH_LEFT,MAX_DEPTH_RIGHT)+1
        
###### Complexity:


#### Iterative Approach:
###### Complexity: