package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

    private final int capacity;

    private int size;

    private int front;

    private int rear;

    private final E[] data;

    @SuppressWarnings("unchecked")
    public FixedArrayQueue(final int capacity) {
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = capacity - 1;
    }

    @Override
    public boolean offer(final E obj) {
        if(size == capacity){
            return false;
        }
        else{
            rear=(rear+1)%capacity;
            data[rear] = obj;
            size++;
            return true;
        }
    }

    @Override
    public E peek() {
        if(size == 0){
            return null;
        }
        else {
            return data[front];
        }
    }

    @Override
    public E poll() {
        if(size == 0){
            return null;
        }
        else {
            E obj = data[front];
            size--;
            front = (front+1)%capacity;
            return obj;
        }
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<E> asList() {
        List<E> list = new ArrayList<>(size);
        int r = rear, f = front, s = size;
        while(s!=0){
            list.add(data[f]);
            f = (f+1)%capacity;
            s--;
        }
        return list;
    }
}
