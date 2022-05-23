package com.collections.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeExample
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree
    {
        static int index =-1;
        public static Node buildTree(int nodes[])
        {
            index++;
            if(nodes[index] == -1)
            {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node current = q.remove();
            if(current == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                System.out.println();
                q.add(null);
            }
            else
            {
                System.out.print(current.data + " ");
                if(current.left != null)
                {
                    q.add(current.left);
                }
                if(current.right != null)
                {
                    q.add(current.right);
                }
            }

        }
    }

    public static int countOfNodes(Node root)
    {
        if(root == null)
            return 0;
        int left_count = countOfNodes(root.left);
        int right_count = countOfNodes(root.right);
        return left_count + right_count +1;
    }

    public static int sumOfNodes(Node root)
    {
        if(root == null)
            return 0;
        int left_sum = sumOfNodes(root.left);
        int right_sum = sumOfNodes(root.right);
        return left_sum + right_sum + root.data;
    }

    public static int productOfNodes(Node root)
    {
        if(root == null)
            return 1;
        int left_product = productOfNodes(root.left);
        int right_product = productOfNodes(root.right);
        return left_product * right_product * root.data;
    }

    public static int heightOfTree(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left_height = heightOfTree(root.left);
        int right_height = heightOfTree(root.right);
        return Math.max(left_height,right_height) +1;
    }

    public static boolean isIdentical(Node root, Node subTreeRoot)
    {
        if(subTreeRoot == null && root == null)
        {
            return true;
        }
        if(root == null || subTreeRoot == null)
        {
            return false;
        }

        if(root.data == subTreeRoot.data)
        {
            return isIdentical(root.left, subTreeRoot.left) && isIdentical(root.right, subTreeRoot.right);
        }
        return false;
    }

    public static boolean subTreeCheck(Node root, Node subTreeRoot)
    {
        if(subTreeRoot == null)
        {
            return true;
        }
        if(root == null)
        {
            return false;
        }

        if(root.data == subTreeRoot.data)
        {
            if(isIdentical(root, subTreeRoot))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        //System.out.println(root.data);

        //preOrder(root);
        //inOrder(root);
        //postOrder(root);

        //levelOrder(root);

        //System.out.println(countOfNodes(root));
        //System.out.println(sumOfNodes(root));
        //System.out.println(productOfNodes(root));
        //System.out.println(heightOfTree(root));

    }
}
