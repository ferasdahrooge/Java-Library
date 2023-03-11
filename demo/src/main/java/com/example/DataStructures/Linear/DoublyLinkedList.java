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

    public void sortedInsert(DNode node){
        if (head == null){
            head = tail = node;
            head.next = null;
            head.previous = null;
            size++;
            return;
        }

        DNode current = head;

        if (!isItSorted()){
            sort();
        }

        if (current.data > node.data){
            this.insertHead(node);
            return;
        }

        for (int i = 0; i < size ; i++){
            if (current.data == node.data){
                DNode temp = current.next;
                node.next = temp;
                temp.previous = node;
                node.previous = current;
                current.next = node;
                size++;
                return;
            }

            if(current.next == null){
                this.insertTail(node);
                return;
            }

            if(current.next.data > node.data){
                DNode temp = current.next;
                node.next = temp;
                temp.previous = node;
                node.previous = current; 
                current.next = node;
                size++;
                return;
            }
            current = current.next;
        }
    }

    public void sort(){
        if (size == 0) return;
        if (size == 1) return;

        DNode current = head;
        
        for(int i = 0; i < size; i++){
            boolean sorted = false;

            if (current.next == null || current.next == head) break;

            if (current.data > current.next.data) {
                DNode innerCurrent = head;

                // Disconnect the node
                DNode temp = current.next;
                current.next = temp.next;
                if (temp.next != null) {
                    temp.next.previous = current;
                }
                temp.next = null;
                temp.previous = null;

                for (int j = 0; j <= i; j++) {
                    if (temp == tail) tail = current;

                    if (innerCurrent == head && temp.data < innerCurrent.data) {
                        if (tail.next != null) tail.next = temp;
                        head.previous = temp;
                        temp.next = head;
                        head = temp;
                        sorted = true;
                        break;
                    }

                    if (temp.data < innerCurrent.next.data) {
                        temp.next = innerCurrent.next;
                        temp.previous = innerCurrent;
                        innerCurrent.next.previous = temp;
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
    
    public DNode search(DNode node){
        if (head == null && tail == null) {
            return null;
        }

        DNode current = head;
        for(int i = 0 ; i < size ; i++){
            if (current.data == node.data){
                System.out.println("Data Found");
                return node;
            }
            current = current.next;
        }
        System.out.println("Data not found");
        return null;
    }

    public void deleteHead(){
        if (head == null) return;
        
        DNode temp = head;
        head = head.next;
        temp.next = null;
        head.previous = null;
        size--;
        return;
    }

    public void deleteTail(){
        if (head == null) return;

        DNode current = head;

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        for (int i = 0; i < size; i++) {
            if (current.next.next == null){
                current.next.previous = null;
                current.next = null;
                tail = current;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void delete(DNode node){
        if (head == null) return;

        DNode current = head;
        if (current.data == node.data) {
            this.deleteHead();
            return;
        }
        
        for (int i = 0; i < size; i++) {
            if (i == (size-2)){
                this.deleteTail();
                return;
            }
            if (current.next == node) {
                DNode tempNode = current.next;
                current.next.next.previous = current.next.previous;
                current.next = current.next.next;
                tempNode.next = null;
                tempNode.previous = null;
                size--;
                return;
            }
            current = current.next;
        }
    }

}
