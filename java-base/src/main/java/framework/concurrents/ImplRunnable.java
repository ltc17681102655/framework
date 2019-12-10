package framework.concurrents;

public class ImplRunnable implements Runnable {


    private int i = 100;

    @Override
    public void run() {
        while (i > 1) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "==" + i--);
        }
    }
}
