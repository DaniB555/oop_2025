package oop.labor09;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
private final int capacity;
private ArrayList<Object>items;
    public ArrayListQueue(int capacity) {
        this.capacity = capacity;
        items=new ArrayList<>(capacity);
    }
    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    @Override
    public boolean isFull() {
        return this.items.size()==capacity;
    }

    @Override
    public void enQueue(Object e) {
        if (this.isFull()){
            System.out.println("tele van");
            return;
        }
        this.items.add(e);
    }

    @Override
    public Object deQueue() {
        if (isEmpty()){
            System.out.println("a sor ures van");
            return null;
        }
        return this.items.removeFirst();
    }
    @Override
    public void printQueue() {
        System.out.print("[");
        for(Object o:this.items){
            System.out.print(o+" ");
        }
        System.out.println("]");
    }
    @Override
    public boolean equals(Object e) {
        if (e == null || !(e instanceof ArrayListQueue)) {
            return false;
        }
        ArrayListQueue q = (ArrayListQueue) e;
        if (q.items.size() != this.items.size()) {
            return false;
        }
        for (int i = 0; i < q.items.size(); i++) {
            if (!this.items.get(i).equals(q.items.get(i))) {
                return false;
            }
        }
        return true;
    }
}
