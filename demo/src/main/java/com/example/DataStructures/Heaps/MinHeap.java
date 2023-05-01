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

    // getter for the size of the vector
    public int getSize(){
      return elements.size();
    }

    // swap contents of indicies
    private void swap(int x, int y)
    {
        Integer temp = elements.get(x);
        elements.setElementAt(elements.get(y), x);
        elements.setElementAt(temp, y);
    }

    public int contains(Integer i) {
      if (elements.contains(i) == true) {
          System.out.println("Value " + i + " exists");
          return i;
      }
      System.out.println("Value " + i + " does not exists");
      return 0;
    }
    public boolean isEmpty(){
      if (elements == null){
          System.out.println("Vector Empty");
          return true;
      }
      System.out.println("Vector not Empty");
      return false;
    }
  
    private void heapifyUp(int i){   
      if (i > 0 && elements.get(parent(i)) > elements.get(i)){
          // swap between the elements
          swap(i, parent(i));
          // recursion method to 
          heapifyUp(parent(i));
      }
    }

    private void heapifyDown(int i){
      // get left and right child of node at index i
      int left = left(i);
      int right = right(i);
      int smallest = i;

      // compare the values and index values in the vector
      if (left < getSize() && elements.get(left) < elements.get(i)) {
          // the left becomes the smallest index
          smallest = left;
      }
      if (right < getSize() && elements.get(right) < elements.get(smallest)) {
          // the right becomes the smallest index
          smallest = right;
      }
      if (smallest != i)
      {
          // swap with a child having lesser value
          swap(i, smallest);

          // repeat going downards
          heapifyDown(smallest);
      }
    }

    public void insert(Integer key)
    {
        // insert a new element at the end of the vector
        elements.addElement(key);
        int index = getSize() - 1;
        // heapify based on posiiton of the element in the heap
        heapifyUp(index);
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

    public void delete(Integer key){
      if(!elements.contains(key)){
          System.out.println("Key to delete doesn't exist");
          return;  
      } 

      Integer i = elements.indexOf(key);
      swap(getSize()-1 ,i);
      // Decrease size of heap by 1
      elements.setSize(getSize()-1);
      // heapify down
      heapifyDown(0);
      return;
    } 

    public void sort(){
      for (int i = 1; i < getSize(); i++)
      {
        // if child is bigger than parent
        if (elements.get(i) > elements.get((i - 1) / 2))
        {
          int j = i;
   
          // close to heapify but to turn it into a max heap
          while (elements.get(j) > elements.get((j - 1) / 2))
          {
            swap(j, (j-1)/2);
            j = (j - 1) / 2;
          }
        }
      }
     for (int i = getSize() - 1 ; i > 0; i-- ){

          swap(0, i);
          // similar to the heapify method going down
          // but taking into account the size is adjusted after every loop
          int j = 0, index;

          // loop through the heap by taking the new left position
          do{
              index = left(j);
              // index is the left position
              if(index < (i-1) && elements.get(index) < elements.get(index+1)) index++;
              
              // apply swapping 
              // System.out.println(j);
              if (index < i && elements.get(j) < elements.get(index)) {
                  swap(j, index);
              }
              j = index;
          
          } while(index < i);
      }

  }
  private Vector<Integer> heapify(int[] array){
    MinHeap vec = new MinHeap();

    for (int elem : array){
        vec.insert(elem);
    }
    return vec.elements;
  }

}
