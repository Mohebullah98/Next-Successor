# Next-Successor
Find the next "In-Order" successor in a Binary Search Tree
ex: If we have a BST with nodes [2,5,7,10,12,13]

successor(5) will be 7. successor(10) will be 12.

All we have to do for a given node is see if it has a right child, if it does then the next successor will be the left-most node of the right subtree.
If the node doesn't have a right child, we search up the tree for the next parent that is to the right from that node.
