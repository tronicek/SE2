package edu.tarleton.datastructures;

/**
 *
 * @author Zdenek Tronicek
 */
public class Queue {

    private final int[] values;
    private int head;
    private int tail;
    private int elems;
    
    public Queue(int size) {
        values = new int[size];
    }
    
    public void append(int value) {
        values[tail] = value;
        tail = (tail + 1) % values.length;
        elems++;
    }
    
    public int get() {
        int v = values[head];
        head = (head + 1) % values.length;
        elems--;
        return v;
    }
    
    public boolean isEmpty() {
        return elems == 0;
    }
    
    public boolean isFull() {
        return elems == values.length;
    }
}
