package com.example.DataStructures.Linear;


import java.util.List;

import com.example.DataStructures.nodes.SNode;
public class SingularLinkedListTest {
    public static void main(String[] args) {
        SingularLinkedList list = new SingularLinkedList();
        SNode node1 = new SNode(1);
        SNode node2 = new SNode(2);
        SNode node3 = new SNode(3);
        SNode node4 = new SNode(4);
        SNode node5 = new SNode(5);
        SNode node6 = new SNode(6);
        SNode node7 = new SNode(7);

        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.deleteHead();
        list.deleteTail();
        list.print();
    }
}
