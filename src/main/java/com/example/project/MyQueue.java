package com.example.project;

public interface MyQueue<T extends Comparable<T>> {

  
    public void enqueue(T v); 

    public T dequeue(); 

 
    public T first(); 

    public int size();

    public boolean isEmpty();
}
