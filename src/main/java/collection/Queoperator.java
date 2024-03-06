package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queoperator {
    public static void main(String args[]){
        Queue<String> prqueue=new PriorityQueue<>();
        Queue<Integer> prinqueue=new PriorityQueue<>();
        prqueue.add("raju");
        prqueue.add("hari");
        prqueue.add("anu");
        prinqueue.add(5);
        prinqueue.add(1);
        prinqueue.add(3);
        System.out.println(prqueue);
        System.out.println(prqueue.element());
        System.out.println(prinqueue.peek());
        prqueue.remove();
        prinqueue.poll();
        System.out.println(prinqueue);
        System.out.println(prqueue);


    }
}
