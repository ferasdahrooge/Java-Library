package com.example.DataStructures.Linear;

import com.example.DataStructures.nodes.SNode;

public class QueueLinkedList extends SLL{

    public void enqueue(SNode node){
        super.insertTail(node);
    }

    public void dequeue(){
        super.deleteHead();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        super.clear();
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Empty Queue");
            System.out.println("size of the Queue: " + size);
            System.out.println("No Queue to check if it's sorted");
        }else{
            System.out.println("Queue is not Empty");
            System.out.println("size of the Queue: " + size);
            System.out.println("Front of the Queue: " + head.data);
            System.out.println("Rear of the Queue: " + tail.data);
            System.out.println("*************");
            System.out.println("*************");
            SNode current = head;
            
            System.out.println("The Queue\n");
            for (int i = 0; i < size; i++) {
                System.out.print(current.data + "  ");
                current = current.next;
            }
        }
    }

    @Override
    public void sort(){
        
    }

    @Override
    public void insertHead(SNode node){
    }

    @Override
    public void insertTail(SNode node){
    }
    @Override
    public void insert(SNode node, int position){
    }

    @Override
    public void sortedInsert(SNode node){
    }

    @Override
    public void deleteHead(){
    }

    @Override
    public void deleteTail(){
    }

    @Override
    public void delete(SNode node){
    }

    public void peek(){
        System.out.println("Peeking...Head = " + head.data);
    }
}