package Stack_Queue;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        // ưu tiên theo tăng dần
/*        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1    ;
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());*/

        // dequeue
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.addFirst(4);
        dequeue.addFirst(3);
        dequeue.addFirst(1);
        System.out.println(dequeue.remove());

    }
}
