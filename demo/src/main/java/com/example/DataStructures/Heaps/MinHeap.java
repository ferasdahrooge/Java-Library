package com.example.dataStructures.heaps;

import java.util.Vector;

public class MinHeap{
    
    public int size;
    private Vector<Integer> elements;
    
    public MinHeap(){
        elements = new Vector<>();
    }
    
    public MinHeap(int size){
        elements = new Vector<>(size);
    }

    public MinHeap(int[] array){
        elements = new Vector<>();
        heapify(array);
        size = array.length;
        for(int i = 0 ; i < size ; i++){
            insert(array[i]);
        }
    }
   
    public void clear(){
      elements.setSize(0);
      return;
    }

    // get parent
    private int parent(int i)
    {
        if (i == 0) {
            return -1;
        }
        return (i - 1) / 2;
    }
    // get left child
    private int left(int i) {
      return (2*i + 1);
    }
  
    // get right child
    private int right(int i){
        return (2*i +2);
    }

}
