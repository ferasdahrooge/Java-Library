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
  public int getSize(){
    return elements.size();
  }

  private void swap(int x, int y)
  {
      // swap with a child having greater value
      Integer temp = elements.get(x);
      elements.setElementAt(elements.get(y), x);
      elements.setElementAt(temp, y);
  }

  private void heapify_down(int i)
  {
      int left = left(i);
      int right = right(i);

      int largest = i;

      if (left < getSize() && elements.get(left) > elements.get(i)) {
          largest = left;
      }

      if (right < getSize() && elements.get(right) > elements.get(largest)) {
          largest = right;
      }
      if (largest != i)
      {
          // swap with a child having greater value
          swap(i, largest);
          // call heapify-down on the child
          heapify_down(largest);
      }
  }

  private void heapify_up(int i)
  {
      if (i > 0 && elements.get(parent(i)) < elements.get(i))
      {
          // swap the two if heap property is violated
          swap(i, parent(i));
          // call heapify-up on the parent
          heapify_up(parent(i));
      }
  }

}
