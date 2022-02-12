##  Kth Smallest Element In BST
### Problem Description
Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.

###Problem Constraints
1 <= Number of nodes in binary tree<=100000 </br>
0 <= node values <= 10^9



###Input Format
First and only argument is head of the binary tree A.
###Output Format
Return an integer, representing the Bth element.
###Example Input

Input 1:


            2
          /   \
         1    3
B = 2
Input 2:


            3
           /
          2
         /
        1
B = 1


###Example Output

Output 1: 2 </br>
Output 2: 1 </br>

# Solution-Gist:
Inorder traversal of a BST is a series of elements in increasing order. So just do an inorder traversal and keep a counter variable to count how many elements have been counted. As soon as you reach B-th element in inorder-traversal, you have got your element. 