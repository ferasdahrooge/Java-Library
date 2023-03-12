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

    public SNode search(SNode node){
        super.search(node);
        return node;
    }

    public void clear(){
        super.clear();
    }

    @Override
    public void sortedInsert(SNode node){

    }

    @Override
    public void insert(SNode node, int position){

    }

    @Override
    public void insertHead(SNode node){

    }

    @Override
    public void deleteHead(){

    }

    @Override
    public void insertTail(SNode node){

    }

    @Override
    public void deleteTail(){

    }

    @Override
    public void sort(){

    }

    @Override
    public void delete(SNode node){

    }

}
