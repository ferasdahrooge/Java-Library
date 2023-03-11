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
    public void insertHead(SNode node){
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
        return;
    }

    public void insertTail(SNode node){
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
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

        // Loop and stop at the node just before the required position
        for (int i = position; i > 2; i--) {
            current = current.next;
        }

        node.next = current.next;
        current.next = node;
        size++;
    }

    public void sort(){
        if (size == 0) return;
        if (size == 1) return;

        SNode current = head;
        
        for(int i = 0; i < size; i++){
            boolean sorted = false;

            if (current.next == null || current.next == head) break;

            if (current.data > current.next.data) {
                SNode innerCurrent = head;

                // Disconnect the node
                SNode temp = current.next;
                current.next = temp.next;
                temp.next = null;

                for (int j = 0; j <= i; j++) {
                    if (temp == tail) tail = current;

                    if (innerCurrent == head && temp.data < innerCurrent.data) {
                        if (tail.next != null) tail.next = temp;
                        temp.next = head;
                        head = temp;
                        sorted = true;
                        break;
                    }

                    if (temp.data < innerCurrent.next.data) {
                        temp.next = innerCurrent.next;
                        innerCurrent.next = temp;
                        sorted = true;
                        break;
                    }

                    innerCurrent = innerCurrent.next;
                }
            }

            if (sorted) continue;
            current = current.next;
        }
    }
}