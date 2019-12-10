package framework.concurrency.create.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 16:08
 * @Description:
 */

public class Safe_Lock implements Runnable {

    private Lock lock = new ReentrantLock();

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
            lock.unlock();
        }
    }
}
