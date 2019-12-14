package framework.concurrents;

/**
 * 对象锁
 */
public class ImplRunnable_Synchronized_object implements Runnable {

    private int i = 1;

    @Override
    public void run() {
        synchronized (this) {
            for (int j = 0; j < 5; j++) {
                try {
                    Thread.sleep(10);
                    if (j > 0) {
                        System.out.println(Thread.currentThread().getName() + "==" + i++);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

