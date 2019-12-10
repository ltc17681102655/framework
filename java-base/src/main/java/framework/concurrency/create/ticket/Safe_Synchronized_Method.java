package framework.concurrency.create.ticket;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 16:08
 * @Description:
 */

public class Safe_Synchronized_Method implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        sendTicket();
    }

    synchronized void sendTicket() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
