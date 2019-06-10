##Problem

Given a binary tree, return the inorder traversal of its nodes' values.

Example:

    Input: [1,null,2,3]
       1
        \
         2
        /
       3

    Output: [1,3,2]
    
######Follow up: Recursive solution is trivial, could you do it iteratively?

##Solution
InOrder Traversal is to visit Left Node --> Parent Node --> Right Node.

####Recursive Approach:
Recursive approach is straightforward.

    Inorder_Traverse(List, Node):
        If Node is Not Null{
            If Node.Left is Not Null{
                Call Inorder_Traverse(List,Node.Left)
            }               
            Add Node.Value to the List        
            If Node.Left is Not Null{
                Call Inorder_Traverse(List,Node.Right)
            }       
        }
    
######Complexity:

####Iterative Approach:
Recursive approach uses <b>Stack</b> internally. Here we'll use Stack DataStructure to explicitly control the nodes to visit.

    Inorder_Iterative(Node)
        1. Create an empty Stack 'S'
        2. Initialize current node 'C' as root.
        3. Push 'C' onto Stack 'S' and set C = C.LEFT. Repeat this until C is Null. 
        4. If 'S' is Not Empty OR 'C' is Not Null
            1. Pop node 'N' from 'S'
            2. Add 'N.val' to List. Set 'C'= N.RIGHT.
            3. GoTo Step 3.
        5. Step 3,4 gets repeated until 'S' is Not empty.     
            
######Complexity
