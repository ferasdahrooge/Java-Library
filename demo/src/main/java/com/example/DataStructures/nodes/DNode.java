package com.example.DataStructures.nodes;

public class DNode {
    public int data;
    public DNode next = null;
    public DNode previous = null;

    public DNode(int data) {
        this.data = data;
    }

    public void print() {
        System.out.println("Data: " + data);
        if (next != null) {
            System.out.println("Next: " + next.data);
        }
        if (previous !=null){
            System.out.println("Previous: " + previous.data);
        }
        System.out.println("------------------------------");
    }
}
