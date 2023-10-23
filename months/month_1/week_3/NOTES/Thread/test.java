package months.month_1.week_3.NOTES.Thread;

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
                count++;
//                synchronized (lock) {
//                    count++;
//                }
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
}