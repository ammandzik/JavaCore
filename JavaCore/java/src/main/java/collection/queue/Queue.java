package collection.queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

class Queue {

    public static List<Integer> list = List.of(34,23,22,11,2,78,99,100,1000,233,23);

    public static void queue(){

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addAll(list);

        System.out.println(queue);
        System.out.println(queue.peekLast());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peek());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());
        System.out.println(queue);


        System.out.println("***QUEUE***");


    }

    public static void dequeue(){

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>();
        deque.addAll(list);
        linkedBlockingDeque.addAll(list);



        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);
        deque.offerFirst(987);
        deque.offerLast(67);
        deque.offer(65);
        System.out.println(deque);

        linkedBlockingDeque.removeFirstOccurrence(23);
        linkedBlockingDeque.addLast(9999);
        linkedBlockingDeque.addFirst(11);
        System.out.println(linkedBlockingDeque);



    }


}
