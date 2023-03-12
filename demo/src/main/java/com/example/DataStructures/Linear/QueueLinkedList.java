package com.example.DataStructures.Linear;

import com.example.DataStructures.nodes.SNode;

public class Queuell extends SLL{

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
}