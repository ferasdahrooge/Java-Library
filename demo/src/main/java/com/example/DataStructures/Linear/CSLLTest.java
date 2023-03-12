package com.example.DataStructures.Linear;


import com.example.DataStructures.nodes.SNode;

public class CSLLTest {
    public static void main(String[] args) {
        CSLL list = new CSLL();
        SNode node1 = new SNode(1);
        SNode node2 = new SNode(2);
        SNode node3 = new SNode(3);
        SNode node4 = new SNode(4);
        SNode node5 = new SNode(5);
        SNode node6 = new SNode(6);
        SNode node7 = new SNode(7);
        
        list.insertHead(node3);
        list.insertTail(node5);
        list.sort();
        list.print();  
        
    }
}
