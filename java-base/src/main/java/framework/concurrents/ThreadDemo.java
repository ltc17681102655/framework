package framework.concurrents;

public class ThreadDemo {

    public static void main(String[] args) {
//        no_safe();
//        lock();
//        syn();
    }

    //不安全的
    private static void no_safe() {
        ImplRunnable implRunnable = new ImplRunnable();
        Thread thread = new Thread(implRunnable);
        Thread thread2 = new Thread(implRunnable);
        Thread thread3 = new Thread(implRunnable);
        thread.start();
        thread2.start();
        thread3.start();
    }

    //lock锁
    private static void lock() {
        ImplRunnable_Lock implRunnable = new ImplRunnable_Lock();
        Thread thread = new Thread(implRunnable);
        Thread thread2 = new Thread(implRunnable);
        Thread thread3 = new Thread(implRunnable);
        thread.start();
        thread2.start();
        thread3.start();
    }

    //syn同步代码块
    private static void syn() {
        ImplRunnable_Synchronized implRunnable = new ImplRunnable_Synchronized();
        Thread thread = new Thread(implRunnable);
        Thread thread2 = new Thread(implRunnable);
        Thread thread3 = new Thread(implRunnable);
        thread.start();
        thread2.start();
        thread3.start();
    }


}
