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

    public void insertTail(SNode node){
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
        return;
    }

    public void insert(SNode node, int position){
        if (position < 1 || position > size) {
            System.out.println("Cannot be added");
            return;
        }

        if (position == 1) {
            insertHead(node);
            return;
        }

        SNode current = head;

        if (position == 2){
            node.next = current.next;
            current.next = node;
            size++;
            return;
        }

        for (int i = position; i > 2; i--){
            current = current.next;
        }

        node.next = current.next;
        current.next = node;
        tail.next = head;
        size++;

    }

    public void sortedInsert(SNode node){
        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        
        if(!isItSorted()){
            sort();
        }
        SNode current = head;
        if (current.data > node.data){
            this.insertHead(node);
            return;
        }

        for (int i = 0; i < size; i++) {
            if (current.data == node.data){
                SNode temp = current.next;
                node.next = temp;
                current.next = node;
                size++;
                return;
            }

            if (i == size - 1) {
                System.out.println(i);
                this.insertTail(node);
                return;
            }

            if (current.next.data > node.data){
                node.next = current.next;
                current.next = node;
                size++;
                return;
            }
            current = current.next;
        }
        
    }
}
