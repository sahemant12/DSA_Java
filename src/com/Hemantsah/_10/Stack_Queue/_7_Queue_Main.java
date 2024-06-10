package com.Hemantsah._10.Stack_Queue;

public class _7_Queue_Main {
    public static void main(String[] args) throws Exception {
        _6_Queue_CustomImplementation queue = new _6_Queue_CustomImplementation(10);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(8);
//        queue.enqueue(10);
//        queue.display();
//        queue.dequeue();
//        queue.dequeue();
//        queue.display();
//        queue.enqueue(80);
//        queue.display();
//        System.out.println(queue.peek());
//        queue.display();


//        //circular queue
//        _8_CircularQueue circularQueue = new _8_CircularQueue();
//        circularQueue.enqueue(4);
//        circularQueue.enqueue(5);
//        circularQueue.enqueue(8);
//        circularQueue.enqueue(10);
//        circularQueue.display();
//        circularQueue.dequeue();
//        circularQueue.dequeue();
//        circularQueue.display();
//        circularQueue.enqueue(80);
//        circularQueue.display();
//        System.out.println(queue.peek());
//        circularQueue.display();




        //Kunal Kushwaha
        _10_QueueCustomImplementationKK queueKK = new _10_QueueCustomImplementationKK();
        queueKK.insert(23);
        queueKK.insert(56);
        queueKK.insert(1);
        queueKK.insert(34);
        queueKK.display();
        queueKK.remove();
        queueKK.display();
    }
}
