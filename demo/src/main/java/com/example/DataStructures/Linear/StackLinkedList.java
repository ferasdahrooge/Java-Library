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

    @Override
    public boolean isItSorted(){
        return false;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Empty Stack");
            System.out.println("height of the stack: " + size);
            System.out.println("No Stack to check if it's sorted");
        }else{
            System.out.println("Stack is not Empty");
            System.out.println("size of the Stack: " + size);
            System.out.println("Top of the stack: " + head.data);
            System.out.println("*************");
            System.out.println("*************");
            SNode current = head;
            
            System.out.println("The Stack\n");
            System.out.println("Top");
            System.out.println("------------------------------");
            for (int i = 0; i < size; i++) {
                current.print();
                current = current.next;
            }
            System.out.println("Bottom");
        }
    }

}
