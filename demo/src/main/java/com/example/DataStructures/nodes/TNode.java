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


}
