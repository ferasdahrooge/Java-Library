package com.example.DataStructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.example.DataStructures.nodes.TNode;


public class BST {
  
  private TNode root;

  public BST(){
      this.root = null;
  }

  public BST(int val){
      TNode node = new TNode(val,0,null,null,null);
      root = node;
  }

  public BST(TNode node){
        this.root = node;
  }

  public TNode getRoot(){
    return this.root;
}

  public TNode setRoot(TNode node){
    return this.root = node;
  }

  public void insert(int val){
    TNode node = new TNode(val,0,null,null,null);
    TNode traversedNode = null;
    TNode top = this.root;

    while(top != null){
        traversedNode = top;
        if(node.getData() < top.getData()){
            top = top.getLeft();
        } else{
            top = top.getRight();
        }
    }

    node.setParent(traversedNode);
    if (traversedNode == null){
        root = node;
    } else if (node.getData() < traversedNode.getData()){
        traversedNode.setLeft(node);
    } else{
        traversedNode.setRight(node);
    }
}
}
