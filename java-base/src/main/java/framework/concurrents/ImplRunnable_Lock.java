package framework.concurrents;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ImplRunnable_Lock implements Runnable {

    private Lock lock = new ReentrantLock();

    private int i = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            if (i > 0) {
                System.out.println(Thread.currentThread().getName() + "==" + i--);
            }
            lock.unlock();
        }
    }
}

