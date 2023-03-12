package com.example.DataStructures.Linear;

import com.example.DataStructures.nodes.DNode;

public class DCLLTest {
    public static void main(String[] args) {
        
    
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        DNode node1 = new DNode(1);
        DNode node2 = new DNode(2);
        DNode node3 = new DNode(3);
        DNode node4 = new DNode(4);
        DNode node5 = new DNode(5);
        DNode node6 = new DNode(6);
        DNode node7 = new DNode(7);
            
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.sort();
        list.print();
    }
}
