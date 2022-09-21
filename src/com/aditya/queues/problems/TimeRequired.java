package com.aditya.queues.problems;

import java.util.PriorityQueue;
import java.util.Queue;

public class TimeRequired {

    public static void main(String[] args) {
        //create custom queues
        CustomQueue queue1=new CustomQueue(1,10,1);
        // ...

        //putting queues into priorityQueue and putting the logic for extraction

        Queue<CustomQueue> queue=new PriorityQueue<CustomQueue>((a, b)->{
            //return on min average time per person

            return (int)(a.currentSize/a.getTimePerPerson()-b.currentSize/b.getTimePerPerson());
        });

        //extract the queue from the priorityQueue for time estimation
        CustomQueue queueMin=queue.poll();
        Integer currentSize=queueMin.getCurrentSize();
        Integer timePerPerson= queueMin.getTimePerPerson();
        queueMin.setCurrentSize(queueMin.getCurrentSize()-1);
        queue.offer(queueMin);
        long totalTime=currentSize* timePerPerson;
    }
}
