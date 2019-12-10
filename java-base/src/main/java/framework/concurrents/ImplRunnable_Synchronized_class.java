package framework.concurrents;

/**
 * 类锁
 */
public class ImplRunnable_Synchronized_class implements Runnable {

    private static int i = 1;

    @Override
    public void run() {
        synchronized (ImplRunnable_Synchronized_class.class) {
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

