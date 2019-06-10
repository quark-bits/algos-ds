## Problem
Given a binary tree, flatten it to a linked list in-place.

    For example, given the following tree:
        1
       / \
      2   5
     / \   \
    3   4   6

    The flattened tree should look like:
    1
     \
      2
       \
        3
         \
          4
           \
            5
             \
              6

## Solution
Building LinkedList Out-of-Place is Trivial. We can do PreOrder Traversal and build the LinkedList.
This question expects in-place solution.
  
#### Approach:
    VISIT NODE 'N'
    IF N.LEFT exists
        IF N.RIGHT exists
            N.LEFT.RIGHT = N.RIGHT
            N.RIGHT = N.LEFT
            N.LEFT = NULL;            
    ELSE
        N.RIGHT = N.LEFT        
        
            
###### Complexity:


