package framework.concurrents.create;

/**
 * @Auther: ltc
 * @Date: 2019/12/4 15:56
 * @Description:
 */

public class Implement_Runnable implements Runnable {

    private Integer i = 0;

    @Override
    public void run() {
        System.out.println("==实现==" + i++);
    }
}
