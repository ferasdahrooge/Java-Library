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
}
