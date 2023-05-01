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
  public void clear(){
    elements.setSize(0);
    return;
  }
  private int parent(int i)
    {
        if (i == 0) {
            return -1;
        }
        return (i - 1) / 2;
  }

  private int left(int i) {
    return (2*i + 1);
  }

  private int right(int i){
    return (2*i +2);
  }

}
