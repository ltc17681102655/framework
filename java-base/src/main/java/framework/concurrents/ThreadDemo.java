package framework.concurrents;

public class ThreadDemo {

    public static void main(String[] args) {
//        no_safe();
//        lock();
//        syn();
//        syn_one_object();
//        syn_more_object();
//        syn_static_method();
        syn_class();
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

    //syn
    private static void syn() {
        ImplRunnable_Synchronized implRunnable = new ImplRunnable_Synchronized();
        Thread thread = new Thread(implRunnable);
        Thread thread2 = new Thread(implRunnable);
        Thread thread3 = new Thread(implRunnable);
        thread.start();
        thread2.start();
        thread3.start();
    }

    //syn_one_object(对象锁:相同对象)
    private static void syn_one_object() {
        ImplRunnable_Synchronized_object implRunnable = new ImplRunnable_Synchronized_object();
        Thread thread = new Thread(implRunnable);
        Thread thread2 = new Thread(implRunnable);
        Thread thread3 = new Thread(implRunnable);
        thread.start();
        thread2.start();
        thread3.start();
    }

    //syn_more_object(对象锁:不同对象)
    private static void syn_more_object() {
        Thread thread = new Thread(new ImplRunnable_Synchronized_object());
        Thread thread2 = new Thread(new ImplRunnable_Synchronized_object());
        Thread thread3 = new Thread(new ImplRunnable_Synchronized_object());
        thread.start();
        thread2.start();
        thread3.start();
    }

    //syn_static_method
    private static void syn_static_method() {
        Thread thread = new Thread(new ImplRunnable_Synchronized_static_method());
        Thread thread2 = new Thread(new ImplRunnable_Synchronized_static_method());
        Thread thread3 = new Thread(new ImplRunnable_Synchronized_static_method());
        thread.start();
        thread2.start();
        thread3.start();
    }

    //syn_class
    private static void syn_class() {
        Thread thread = new Thread(new ImplRunnable_Synchronized_class());
        Thread thread2 = new Thread(new ImplRunnable_Synchronized_class());
        Thread thread3 = new Thread(new ImplRunnable_Synchronized_class());
        thread.start();
        thread2.start();
        thread3.start();
    }


}
