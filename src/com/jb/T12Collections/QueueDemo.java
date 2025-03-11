package com.jb.T12Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {
    class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String value1, String value2) {
            return Integer.compare(value2.length(), value1.length());
        }
    }
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        System.out.println(queue.poll()); //getout queue / remove --null
        queue.offer("jaya"); //add
        System.out.println(queue); //[jaya]
        queue.addAll(List.of("bala","jb","tharun")); 
        System.out.println(queue); //[bala, jaya, jb, tharun] -- sorted due to priorityqueue
        System.out.println(queue.poll()); //bala
        System.out.println(queue.poll()); //jaya
        System.out.println(queue.poll()); //jb
        System.out.println(queue.poll()); //tharun
        System.out.println(queue.poll()); //null
        System.out.println(queue); //[]
        queue.addAll(List.of("bala","jb","tharun","Jaya","jB"));
        System.out.println(queue);

        Queue<String> queue1=new PriorityQueue<>(new QueueDemo().new StringLengthComparator());
        queue1.addAll(List.of("bala","jb","tharun","Jaya","jB"));
        System.out.println(queue1); //[tharun, Jaya, bala, jb, jB] -- sorted desc based on length and caps
    }
}