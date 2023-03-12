package com.example.DataStructures.Linear;

import java.util.EmptyStackException;

import com.example.DataStructures.nodes.SNode;


public class StackLinkedList extends SingularLinkedList{
    public void push(SNode node){
        super.insertHead(node);
    }

}
