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

  public boolean isEmpty(){
    if (elements == null){
        System.out.println("Vector Empty");
        return true;
    }
    System.out.println("Vector not Empty");
    return false;
  }

  public void insert(Integer key)
  {
      // insert a new element at the end of the vector
      elements.addElement(key);
      int index = getSize() - 1;
      heapify_up(index);
  }

  public int contains(Integer i) {
    if (elements.contains(i) == true) {
        System.out.println("Value " + i + " exists");
        return i;
    }
    System.out.println("Value " + i + " does not exists");
    return 0;
  }

  public void delete(Integer key){
        
    if(!elements.contains(key)){
        System.out.println("Doesn't Exist");
        return;  
    } 

    Integer i = elements.indexOf(key);
    swap(getSize()-1 ,i);
    // Decrease size of heap by 1
    elements.setSize(getSize()-1);
    // heapify down
    heapify_down(0);
    return;
  }
  public void print(){
    String line = new String(new char[5]);
    System.out.print("Parent index: ");
    for (int i = 0; i< elements.size() ; i++){
        String parent = String.valueOf(parent(i));
        String parentInLine = line.format("%8s",parent);
        System.out.print(parentInLine);
    }
    System.out.println();
    System.out.print("Element Heap: ");
    for (int i = 0 ; i < elements.size() ; i++){
        String numberAdded = String.valueOf(elements.get(i));
        String numbersInLine = line.format("%8s",numberAdded);
        System.out.print(numbersInLine);

    }
  }

}
