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
    public void insertTail(DNode node){
        if (head == null) {
            head = node;
            tail = node;
            node.previous = node;
            node.next = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        head.previous = node;
        node.previous = tail;
        tail = node;
        size++;
        return;
    }


    public void insert(DNode node, int position){
        if (position < 1 || position > size) {
            System.out.println("Cannot be added");
            return;
        }
        System.out.println(size);
        if (position == 1) {
            insertHead(node);
            return;
        }

        DNode current = head;

        if (position == 2){
            node.next = current.next;
            node.previous = current;
            current.next.previous = node;
            current.next = node;
            size++;
            return;
        }

        for (int i = position; i > 2; i--){
            current = current.next;
        }

        node.next = current.next;
        node.previous = current;
        current.next.previous = node;
        current.next = node;
        size++;

    }
}
