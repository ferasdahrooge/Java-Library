package com.example.DataStructures.trees;

import com.example.DataStructures.nodes.TNode;

public class testTree {
    public static void main(String[] args) {
        AVL bst = new AVL();
        TNode node1 = new TNode(15, 0, null,null, null); 
        TNode node2 = new TNode(20, 0, null,null, null); 
        TNode node3 = new TNode(12, 0, null,null, null); 
        TNode node4 = new TNode(14, 0, null,null, null); 
        TNode node5 = new TNode(1, 0, null,null, null); 
        TNode node6 = new TNode(16, 0, null,null, null); 
        TNode node7 = new TNode(25, 0, null,null, null); 
        TNode node8 = new TNode(2, 0, null,null, null); 
        TNode node9 = new TNode(17, 0, null,null, null); 
        TNode node10 = new TNode(18, 0, null,null, null); 
        TNode node11 = new TNode(19, 0, null,null, null); 
        bst.insert(node1);
        bst.insert(node2);
        bst.insert(node3);
        bst.insert(node4);
        bst.insert(node5);
        bst.insert(node7);
        bst.insert(node6);
        bst.insert(node8);
        bst.insert(node9);
        bst.insert(node10);
        bst.insert(node11);
        bst.search(111);
        // bst.insert(node8);

        // bst.delete(node4);
        // bst.delete(node5);
        bst.delete(node11);
        bst.printBF();
        bst.printInorder();
    }
}
