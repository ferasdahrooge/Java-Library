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

    public void insert(TNode node){
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
    public void delete(TNode node_to_delete){
      if(root == null) return;
      
      TNode current = root;
      while(current != null){
          // traverse
          if (node_to_delete.getData() > current.getData()){
              current = current.getRight();
              continue;
          
          }
          if (node_to_delete.getData() < current.getData()){
              current = current.getLeft();
              continue;
          }
          if (node_to_delete.getData() == current.getData()){
          // if two children
              if(current.getRight() != null && current.getLeft() != null){
                  TNode node_to_iterate = current.getLeft();
                  
                  if(node_to_iterate.getParent().getLeft().getData() == node_to_iterate.getData()){
                      if(node_to_iterate.getRight() == null){
                          node_to_iterate.setParent(current.getParent());
                          node_to_iterate.setRight(current.getRight());
                          node_to_iterate.getRight().setParent(node_to_iterate);
                          if(current.getParent().getLeft().getLeft().getData() == node_to_iterate.getData()) {
                              node_to_iterate.getParent().setLeft(node_to_iterate);
                          }else if (current.getParent().getRight().getLeft().getData() == node_to_iterate.getData()){ 
                              node_to_iterate.getParent().setRight(node_to_iterate);
                          }

                      }else{
                          while(node_to_iterate.getRight()!= null){
                              node_to_iterate = node_to_iterate.getRight();
                          }

                          node_to_iterate.getParent().setRight(node_to_iterate.getLeft());
                          if (node_to_iterate.getLeft() != null) node_to_iterate.getLeft().setParent(node_to_iterate.getParent());
                          if (current.getParent() == null){
                              root = node_to_iterate;
                              node_to_iterate.setParent(null);
                              node_to_iterate.setLeft(current.getLeft());
                              node_to_iterate.setRight(current.getRight());
                              node_to_iterate.getRight().setParent(node_to_iterate.getRight());
                              node_to_iterate.getLeft().setParent(node_to_iterate.getLeft());
                          }else{
                              TNode left_node = current.getLeft();
                              node_to_iterate.setParent(current.getParent());
                              node_to_iterate.setRight(current.getRight());
                              node_to_iterate.setLeft(current.getLeft());
                              node_to_iterate.getRight().setParent(node_to_iterate);
                              node_to_iterate.getLeft().setParent(node_to_iterate);
                              if(current.getParent().getLeft().getLeft().getData() == left_node.getData()) {
                                  node_to_iterate.getParent().setLeft(node_to_iterate);
                              }else if (current.getParent().getRight().getLeft().getData() == left_node.getData()){ 
                                  node_to_iterate.getParent().setRight(node_to_iterate);
                              }
      
                          }   

                      }
                      
                  }
                  
                  current.setParent(null);
                  current.setLeft(null);
                  current.setRight(null);
                  return;
  
              }
          }
              // one child (left child)
              if(current.getLeft() != null && current.getRight() == null){
                  current.getLeft().setParent(current.getParent());
                  if(current.getParent().getRight() != null && current.getParent().getRight().getData() == current.getData()){
                      current.getParent().setRight(current.getLeft());
                  }
                  if(current.getParent().getLeft() != null && current.getParent().getLeft().getData() == current.getData()){
                      current.getParent().setLeft(current.getLeft());
                  }
                  current.setLeft(null);
                  current.setParent(null);
                  return;
              }
              // one child (right child)
              if(current.getRight() != null && current.getLeft() == null){
                  current.getRight().setParent(current.getParent());
                  if(current.getParent().getRight() != null && current.getParent().getRight().getData() == current.getData()){
                      current.getParent().setRight(current.getRight());
                  }
                  if(current.getParent().getLeft() != null && current.getParent().getLeft().getData() == current.getData()){
                      current.getParent().setLeft(current.getRight());
                  }
                  current.setRight(null);
                  current.setParent(null);
                  return;
              }
              // leaf
              if(current.getLeft() == null && current.getRight() == null){
                  TNode parent  = current.getParent();
                  if (parent.getLeft() != null && parent.getLeft().getData() == current.getData()){
                      parent.setLeft(null);
                      current.setParent(null);
                      return;
                  }
                  if(parent.getRight() != null && parent.getRight().getData() == current.getData()){
                      parent.setRight(null);
                      current.setParent(null);
                      return;
                  }
              }
          
          }
      System.out.println("Node to delete doesn't exist");
  }
}
