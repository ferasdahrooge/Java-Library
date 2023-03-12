package com.example.dataStructures.Linear;

import com.example.dataStructures.nodes.SNode;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList list = new QueueLinkedList();
        SNode node1 = new SNode(1);
        SNode node2 = new SNode(2);
        SNode node3 = new SNode(3);
        SNode node4 = new SNode(4);
        SNode node5 = new SNode(5);
        SNode node6 = new SNode(6);
        SNode node7 = new SNode(7);

        list.enqueue(node1);
        list.enqueue(node2);
        list.enqueue(node3);
        list.enqueue(node4);
        list.dequeue();
        list.print();
    }
    
}
