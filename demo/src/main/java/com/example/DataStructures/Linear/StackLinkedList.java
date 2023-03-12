package com.example.DataStructures.Linear;

import java.util.EmptyStackException;

import com.example.DataStructures.nodes.SNode;


public class StackLinkedList extends SingularLinkedList{
    public void push(SNode node){
        super.insertHead(node);
    }

    public void pop(){
        super.deleteHead();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        System.out.println("Peeking... the data is : "+ head.data);
        return;
    }
}
