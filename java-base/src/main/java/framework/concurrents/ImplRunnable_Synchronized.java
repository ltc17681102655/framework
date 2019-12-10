package framework.concurrents;

public class ImplRunnable_Synchronized implements Runnable {

    private int i = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步方法
//            syn();
            //同步代码块
            synchronized (this) {
                if (i > 0) {
                    System.out.println(Thread.currentThread().getName() + "==" + i--);
                }
            }
        }
    }

    //同步方法
    private synchronized void syn() {
        if (i > 0) {
            System.out.println(Thread.currentThread().getName() + "==" + i--);
        }
    }
}

