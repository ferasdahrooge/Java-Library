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

    public void insertHead(DNode node){
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        head.previous = node;
        node.next = head;
        head = node;
        size++;
        return;
    }

    public void insertTail(DNode node){
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
        return;
    }

    public void insert(DNode node, int position) {
        if (position < 1 || position > size) {
            System.out.println("Cannot be added");
            return;
        }

        if (position == 1) {
            insertHead(node);
            return;
        }
        
        DNode current = head;

        // Loop and stop at the node just before the required position
        for (int i = position; i > 2; i--) {
            current = current.next;
        }

        node.next = current.next;
        node.previous = current;
        current.next.previous = node;
        current.next = node;
        size++;
    }
    
}
