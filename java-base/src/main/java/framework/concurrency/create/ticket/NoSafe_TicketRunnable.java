package framework.concurrency.create.ticket;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 16:08
 * @Description:
 */

public class NoSafe_TicketRunnable implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
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
