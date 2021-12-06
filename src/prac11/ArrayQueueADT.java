package prac11;

public class ArrayQueueADT {
    public Object[] queue;
    private int maxSize;
    private int nElem; //текущее количетсво элементов в очереди
    private int front;
    private int rear;

    public ArrayQueueADT(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    //добавить элемент в очередь
    public void enqueue(ArrayQueueADT queue, Object elem) {
        if(queue.rear == queue.maxSize - 1) {
            rear = -1;
        }
        queue.queue[++rear] = elem; //увелечение rear и вставка
        queue.nElem++;
    }

    //удалить и вернуть первый элемент в очереди
    public Object dequeue(ArrayQueueADT queue) {
        Object temp = queue.queue[queue.front++]; // получение первого элемента
        if (queue.front == queue.maxSize) {
            queue.front = 0; //цикличесий перенос
        }
        queue.nElem--;
        return temp;
    }

    //первый элемент в очереди
    public Object element(ArrayQueueADT queue) {
        return queue.queue[queue.front++];
    }

    //удаление элементов из очереди
    public void clear(ArrayQueueADT queue) {
       queue.queue = new Object[queue.maxSize];
       queue.rear = -1;
       queue.front = 0;
       queue.nElem = 0;
    }

    //очередь пуста?
    public boolean isEmpty(ArrayQueueADT queueADT) {
        return (queueADT.nElem == 0);
    }

    //получить размер очереди
    public int getSize(ArrayQueueADT queueADT) {
        return queueADT.nElem;
    }
}
