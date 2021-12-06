package prac11;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue{
    public LinkedList[] queue;
    private int maxSize;
    private int nElem; //текущее количетсво элементов в очереди
    private int front;
    private int rear;

    public LinkedQueue(int maxSize) {
        this.maxSize = maxSize;
        queue =  new LinkedList[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    //добавить элемент в очередь
    public void enqueue(LinkedList elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem; //увелечение rear и вставка
        nElem++;
    }

    //удалить и вернуть первый элемент в очереди
    public Object dequeue() {
        LinkedList temp = queue[front++]; // получение первого элемента
        if (front == maxSize) {
            front = 0; //цикличесий перенос
        }
        nElem--;
        return temp;
    }

    @Override
    public void clear() {
        queue = new LinkedList[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    @Override
    public boolean isEmpty() {
        return (nElem == 0);
    }

    @Override
    public int getSize() {
        return nElem;
    }
}
