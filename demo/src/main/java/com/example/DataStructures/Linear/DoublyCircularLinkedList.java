package com.example.dataStructures.Linear;

import com.example.dataStructures.nodes.DNode;

public class DoublyCircularLinkedList extends DoublyLinkedList{
    public DoublyCircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DoublyCircularLinkedList(DNode node) {
        this.head = node;
        this.tail = node;
        node.next = node;
        node.previous = node;
        this.size = 1;
    }

    public void insertHead(DNode node) {
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            node.previous = tail;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        head.previous = node;
        node.previous = tail;
        head = node;
        size++;
        return;
    }
}
