package com.asherbakov.hwRacing;

import com.asherbakov.hwRacing.exceptions.MissingInQueue;
import com.asherbakov.hwRacing.transport.Bus;
import com.asherbakov.hwRacing.transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> stationQueue = new ArrayDeque<>();

    public void addTransport(Transport t) {
        if (t instanceof Bus) {
            System.out.println("Автобусы не нуждаются в диагностике");
        } else {
            stationQueue.offer(t);
        }
    }

    public void technicalInspection() {
        Transport t = stationQueue.poll();
        if (t != null) {
            System.out.printf("%s %s: техосмотр пройден.\n", t.getBrand(), t.getModel());
        } else {
            System.out.println("Очередь пуста");
        }
    }
}
