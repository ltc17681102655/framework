package framework.concurrents.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class Demo {

    private static AtomicLong atomicLong = new AtomicLong();

    public static void main(String[] args) {
        long andIncrement = atomicLong.getAndIncrement();
        System.out.println(andIncrement);
        //
        long andIncrement1 = atomicLong.getAndIncrement();
        System.out.println(andIncrement1);
    }
}
