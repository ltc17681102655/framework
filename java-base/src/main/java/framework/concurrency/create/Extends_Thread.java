package framework.concurrency.create;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 15:33
 * @Description:
 */

public class Extends_Thread extends Thread {

    private Integer i = 0;

    @Override
    public void run() {
        System.out.println("==继承==" + i++);
    }
}
