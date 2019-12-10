package framework.concurrents;

public class Demo {

    private static int i = 0;

    private static int j = 0;

    public static void main(String[] args) {
        System.out.println(i--);
        System.out.println(i);
        //
        System.out.println();
        //
        System.out.println(--j);
        System.out.println(j);
    }
}
