package com.asherbakov.hw2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;

public class Priority {
    final int MAX_QUEUE_LEN = 5;
    Queue<String> queue1 = new ArrayDeque<>();
    Queue<String> queue2 = new ArrayDeque<>();
    Queue<String> queue3 = new ArrayDeque<>();
    boolean galyaIsWork = false;

    public Priority() {
        fillQueue(queue1, queue2);
        System.out.println("Первая очередь: \n" + queue1);
        System.out.println("Вторая очередь: \n" + queue2);
        System.out.println("Третья очередь: \n" + queue3);

        for (int i = 0; i < 10; i++) {
            if (callGalya(queue1, queue2)) {
                addQueue(UUID.randomUUID().toString(), queue1, queue2, queue3);
            } else {
                addQueue(UUID.randomUUID().toString(), queue1, queue2);
            }
        }

        System.out.println("--------------После добавления---------------");
        System.out.println("Первая очередь: \n" + queue1);
        System.out.println("Вторая очередь: \n" + queue2);
        System.out.println("Третья очередь: \n" + queue3);

        if (galyaIsWork) {
            removePerson(queue1, queue2, queue3);
        } else {
            removePerson(queue1, queue2);
        }
        System.out.println("--------------После удаления---------------");
        System.out.println("Первая очередь: \n" + queue1);
        System.out.println("Вторая очередь: \n" + queue2);
        System.out.println("Третья очередь: \n" + queue3);
    }

    public void fillQueue(Queue... queues) {
        for (Queue q : queues) {
            int size = new Random().nextInt(MAX_QUEUE_LEN + 1);
            for (int i = 0; i < size; i++) {
                q.offer(UUID.randomUUID().toString());
            }
        }
    }

    public void addQueue(String str, Queue... queues) {
        int minValue = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < queues.length; i++) {
            if (queues[i].size() < minValue) {
                minValue = queues[i].size();
                index = i;
            }
        }
        queues[index].offer(str);
    }

    public boolean callGalya(Queue... queues) {
        boolean flag = false;
        for (Queue q : queues) {
            if (q.size() == MAX_QUEUE_LEN) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag && !galyaIsWork) {
            System.out.println("ГАААЛЯЯЯЯЯ!!!!!!!");
            galyaIsWork = true;
        }
        return flag;
    }

    public void removePerson(Queue... queues) {
        int index = new Random().nextInt(queues.length);
        queues[index].remove();
    }
}
