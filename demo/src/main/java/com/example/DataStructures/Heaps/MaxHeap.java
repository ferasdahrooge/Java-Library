package com.example.DataStructures.heaps;
import java.util.Vector;

public class MaxHeap {
  private int size;
  private Vector<Integer> elements;
  
  public MaxHeap(){
      elements = new Vector<>();
  }
  
  public MaxHeap(int size){
      elements = new Vector<>(size);
  }

  public MaxHeap(int[] array){
      elements = new Vector<>();
      heapify(array);
      size = array.length;
      for(int i = 0 ; i < size ; i++){
          insert(array[i]);
      }
  }
}
