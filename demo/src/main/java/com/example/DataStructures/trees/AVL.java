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
}
