package com.example.DataStructures.nodes;

public class TNode {
    private TNode left;
    private TNode right;
    private TNode parent;
    private int data;
    private int balance;

    public TNode(){
        this.data = 0;
        this.balance = 0;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public TNode(int data,int balance,TNode P, TNode L, TNode R){
        this.data = data;
        this.balance =balance;
        this.parent = P;
        this.right = L;
        this.left = R;

    }

      // Data setter getter
      public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data = data;
    }

    // left setter getter
    public TNode getLeft(){
        return this.left;
    }
    public void setLeft(TNode node){
        this.left = node;
    }

    //right getter setter
    public TNode getRight(){
        return this.right;
    }
    public void setRight(TNode node){
        this.right = node;
    }
    // parent getter and setter
    public TNode getParent(){
        return this.parent;
    }
    public void setParent(TNode node){
        this.parent = node;
    }

      // balance getter and setter
      public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    @Override
    public String toString(){
        String str = "";
        if (data != 0) str += "Data: " + data + "\n";
        if (left != null) str += "Left: " +  left.data + "\n";
        if (right != null) str += "Right: " +  right.data + "\n";
        if (parent != null) str += "Parent: " +  parent.data + "\n"; 
        str += "---------------------------\n";
        return str;
    }
    
    public void print(){
        System.out.println(this.toString());
    }

}
