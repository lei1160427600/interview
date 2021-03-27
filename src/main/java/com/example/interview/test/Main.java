package com.example.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiaolei
 * @Title: Main
 * @ProjectName interview
 * @Description: TODO
 * @date 2020/3/1811:21
 */
public class Main {


    static List<Integer> list = new ArrayList<>();
    static List<Integer> preList = new ArrayList<>();
    static List<Integer> middleList = new ArrayList<>();
    static List<Integer> orderList = new ArrayList<>();

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();

//        int pre[]=new int[n];
//        int order[]=new int[n];
//        int post[]=new int[n];

        int[] pre = {6,4,2,5,3,1,7}; // 前序遍历
        int[] order = {4,2,5,6,1,3,7}; // 中序遍历
        int[] post = new int[7]; // 后序遍历

//        for (int i = 0; i < pre.length; i++) {
//            pre[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < order.length; i++) {
//            order[i] = scanner.nextInt();
//        }

//        scanner.close();


//        TreeNode node = reConstructBinaryTree(pre, order);
        TreeNode node = constructBinaryTree(pre, order);
        System.out.println(node);
        postOrder(node);
        preOrder(node);
        middleOrder(node);

        System.out.println("pre list " + Arrays.toString(preList.toArray()));
        System.out.println("middle list " + Arrays.toString(middleList.toArray()));

        for (int i = 0; i < list.size(); i++) {
            post[i] = list.get(i);

        }
        for (int i = 0; i < post.length; i++) {
            System.out.print(post[i]);
            if (i != post.length - 1) System.out.print(" ");

        }
    }


    /**
     * 根据前序遍历和中序遍历构建二叉树
     * @param pre 前序遍历数据
     * @param in 中序遍历数据
     * @return 二叉树
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                // 构建左子树
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                // 构建右子树
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return node;
    }

    public static TreeNode constructBinaryTree(int[] pre ,int[] order){
        if(pre == null || order == null || pre.length == 0 || order.length == 0){
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[0]);
        for (int i = 0; i < order.length; i++) {
            if(pre[0] == order[i]){
                treeNode.left = constructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(order, 0, i));
                treeNode.right = constructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(order, i + 1, order.length));
            }
        }
        return treeNode;
    }


    //后序遍历
    public static void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            list.add(node.val);
        }
    }

    // 前序遍历
    public static void preOrder(TreeNode node){
        if (node != null) {
            preList.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // 中序遍历
    public static void middleOrder(TreeNode node){
        if (node != null) {
            middleOrder(node.left);
            middleList.add(node.val);
            middleOrder(node.right);
        }
    }

    public static void levelOrder(TreeNode treeNode){
        if (treeNode != null){
            orderList.add(treeNode.val);
            if(treeNode.left != null){
                orderList.add(treeNode.left.val);
            }
            if(treeNode.right != null){
                orderList.add(treeNode.left.val);
            }
            levelOrder(treeNode);
        }
    }
}

class TreeNode {
    int val; // 根节点
    TreeNode left; // 左子树
    TreeNode right;// 右子树

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
