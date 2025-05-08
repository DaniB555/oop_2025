package oop.labor09;

public interface IQueue {
    public boolean isEmpty();
    public boolean isFull();
    public void enQueue(Object e);
    public Object deQueue();
    public void printQueue();

}
