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

}
