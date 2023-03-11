package com.example.dataStructures.Linear;

import com.example.dataStructures.nodes.SNode;

public class CSLL extends SingularLinkedList {
    public CSLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public CSLL(SNode node) {
        this.head = node;
        this.tail = node;
        node.next = node;
        this.size = 1;
    }

    public void insertHead(SNode node) {
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        head = node;
        size++;
        return;
    }
}
