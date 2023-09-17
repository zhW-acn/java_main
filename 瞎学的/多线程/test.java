package 瞎学的.多线程;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/17/12:30
 */
public class test {
    public static int count = 0;
    private static final Object lock = new Object();
    public static void add() {
        count++;
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
