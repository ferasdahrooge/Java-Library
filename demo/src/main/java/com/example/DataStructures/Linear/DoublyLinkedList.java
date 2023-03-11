package com.example.DataStructure.Linear;

import com.example.DataStructures.nodes.DNode;

public class DoublyLinkedList {

    public DNode head;
    public DNode tail;
    public int size;

    public DLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DLL(DNode node) {
        this.head = node;
        this.tail = node;
        this.size = 1;
    }
    
}
