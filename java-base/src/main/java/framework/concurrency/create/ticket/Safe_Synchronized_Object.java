package framework.concurrency.create.ticket;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 16:08
 * @Description:
 */

public class Safe_Synchronized_Object implements Runnable {

    private Object object = new Object();

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            //解决线程安全问题的一种方案：使用同步代码块
            //只让一个线程在同步代码中执行
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
