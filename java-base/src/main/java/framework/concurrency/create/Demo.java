package framework.concurrency.create;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 15:35
 * @Description:
 */

public class Demo {

    public static void main(String[] args) {
        //继承
        Extends_Thread extends_thread = new Extends_Thread();
        extends_thread.start();
        //实现
        Thread thread = new Thread(new Implement_Runnable());
        thread.start();
    }
}
