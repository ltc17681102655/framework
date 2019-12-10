package framework.concurrency.create.ticket;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 16:11
 * @Description:
 */

public class Demo {

    public static void main(String[] args) {
//        no_safe();
//        Safe_Synchronized_Object();
//        Safe_Synchronized_Method();
        Safe_Lock();
    }

    private static void no_safe() {
        NoSafe_TicketRunnable noSafeTicketRunnable = new NoSafe_TicketRunnable();
        Thread thread0 = new Thread(noSafeTicketRunnable);
        Thread thread1 = new Thread(noSafeTicketRunnable);
        Thread thread2 = new Thread(noSafeTicketRunnable);
        Thread thread3 = new Thread(noSafeTicketRunnable);
        //
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void Safe_Synchronized_Object() {
        Safe_Synchronized_Object runnable = new Safe_Synchronized_Object();
        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        //
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void Safe_Synchronized_Method() {
        Safe_Synchronized_Method runnable = new Safe_Synchronized_Method();
        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        //
        thread1.start();
        thread0.start();
        thread2.start();
        thread3.start();
    }

    private static void Safe_Lock() {
        Safe_Lock runnable = new Safe_Lock();
        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        //
        thread1.start();
        thread0.start();
        thread2.start();
        thread3.start();
    }

}
