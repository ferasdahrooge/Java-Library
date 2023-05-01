package com.example.DataStructures.trees;

import com.example.DataStructures.nodes.TNode;

public class AVL extends BST{

  private TNode root;

  public AVL(){
      this.root = null;
  }

  public AVL(int val){
      TNode node = new TNode(val,0,null,null,null);
      root = node;
  }

  public AVL(TNode node){
      this.root = node;
      if (node.getLeft() != null) insert(node.getLeft());
      if (node.getRight() != null) insert(node.getRight());
      
  }

  @Override
    public TNode getRoot() {
        return super.getRoot();
    }

  @Override
  public TNode setRoot(TNode node) {
      return super.setRoot(node);
  }

  private void rebalance(TNode node){
    if(node.getBalance() > 0) {
        if(node.getRight().getBalance() < 0){
            rightRotation(node.getRight());
            leftRotation(node);
        }
        else {
            leftRotation(node);
        }
    }
    else if (node.getBalance() < 0){
        if (node.getLeft().getBalance() > 0){
            leftRotation(node.getLeft());
            rightRotation(node);
        } 
        else {
            rightRotation(node);
        }
    }
  }

  private void updateBalance(TNode node) {
    if (node.getBalance() < -1 || node.getBalance() > 1) {
        rebalance(node);
        return;
    }
    // set the balance based before reaching the root
    if (node.getParent() != null) {
        // if the node is in the left side
        if (node == node.getParent().getLeft()) {
            node.getParent().setBalance(node.getParent().getBalance() -1);
        } 
        
        // if the node is in the right side
        if (node == node.getParent().getRight()) {
            node.getParent().setBalance(node.getParent().getBalance() +1);
        }

        if (node.getParent().getBalance() != 0) {
            updateBalance(node.getParent());
        }
    }
  }
  private void rightRotation(TNode node){
    TNode left = node.getLeft();
    node.setLeft(left.getRight());
    if (left.getRight() != null){
        left.getRight().setParent(node);
    }
    left.setParent(node.getParent());
    if (node.getParent() == null){
        this.root = left;
    } else if (node.getData() == node.getParent().getRight().getData()){
        node.getParent().setRight(left);
    } else {
        node.getParent().setLeft(left);
    }
    left.setRight(node);
    node.setParent(left);
    // Update the balances between the nodes
    node.setBalance(node.getBalance() + 1 - Math.min(0, left.getBalance()));
    left.setBalance(left.getBalance() + 1 + Math.max(0, node.getBalance()));
  }
  private void leftRotation(TNode node){
    TNode right = node.getRight();
    node.setRight(right.getLeft());
    if (right.getLeft() != null){
        right.getLeft().setParent(node);
    }
    right.setParent(node.getParent());
    if (right.getParent() == null){
        this.root = right;
    } else if (node.getData() == node.getParent().getLeft().getData()){
        node.getParent().setLeft(right);
    } else {
        node.getParent().setRight(right);
    }

    right.setLeft(node);
    node.setParent(right);
    // Update the balances between the nodes
    node.setBalance(node.getBalance() - 1 - Math.max(0, right.getBalance()));
    right.setBalance(right.getBalance() - 1 + Math.min(0, node.getBalance()));
  }

  @Override
  public void insert(TNode node) {
      super.insert(node);
      updateBalance(node);
  }

  @Override
  public void insert(int val) {
      TNode node = new TNode(val,0,null,null,null);
      super.insert(val);
      updateBalance(node);
  }

}
