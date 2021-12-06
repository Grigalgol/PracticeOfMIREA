package prac11;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule queueModule = new ArrayQueueModule(4);
        queueModule.enqueue(1);
        queueModule.enqueue(2);
        queueModule.enqueue(3);
        queueModule.enqueue(4);

        queueModule.dequeue();
        queueModule.dequeue();
        queueModule.dequeue();

        int n = (int)queueModule.dequeue();
        System.out.println("Очередь после удаления первых 3-x элементов (ArrayQueueModule)");
        System.out.println(n);
        System.out.println();


        ArrayQueueADT queueADT = new ArrayQueueADT(5);
        queueADT.enqueue(queueADT,5);
        queueADT.enqueue(queueADT,4);
        queueADT.enqueue(queueADT,3);
        queueADT.enqueue(queueADT,2);
        queueADT.enqueue(queueADT,1);

        queueADT.dequeue(queueADT);
        queueADT.dequeue(queueADT);
        queueADT.dequeue(queueADT);

        System.out.println("Очередь после удаления первых 3-x элементов (ArrayQueueADT)");
        while (!queueADT.isEmpty(queueADT)) {
            int n2 = (int)queueADT.dequeue(queueADT);
            System.out.println(n2);
        }
        System.out.println();

        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue("пять");
        queue.enqueue("четыре");
        queue.enqueue("три");

        queue.dequeue();

        System.out.println("Очередь после удаления первого элементов (ArrayQueue)");
        while (!queue.isEmpty()) {
            String str = (String) queue.dequeue();
            System.out.println(str);
        }
        System.out.println();

    }
}
