package com.example.DataStructures.Linear;

import com.example.DataStructures.nodes.SNode;

public class SingularLinkedList{
    public SNode head;
    public SNode tail;
    public int size;

    public SingularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public SingularLinkedList(SNode node) {
        this.head = node;
        this.tail = node;
        this.size = 1;
    }
}