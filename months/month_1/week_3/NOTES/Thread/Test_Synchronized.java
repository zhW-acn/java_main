package months.month_1.week_3.NOTES.Thread;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/17/15:52
 */
public class Test_Synchronized {

    private static final Object MONITOR = new Object();//用Object类锁节省开销

    public synchronized void show() throws InterruptedException {//实例方法这样加锁相当于锁this，在循环创建线程时锁的是实例各自的show()，对于主线程而言相当于没锁
        Thread.sleep(100);
        System.out.println("实例方法锁");
    }

    public synchronized static void show_method() throws InterruptedException {//static在类加载到内存后只有一份，所以synchronized实现了同步
        Thread.sleep(100);
        System.out.println("第一种 类方法锁");
    }

    public static void main(String[] args) throws InterruptedException {

        //锁方法
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                try {
                    Test_Synchronized.show_method();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                /*
                try {
                    new Test_Synchronized().show();//50个this都不是一把锁，不可能实现同步
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                */
            }).start();
        }

        //锁代码块
        for (int i = 0; i < 50; i++) {
            synchronized (MONITOR) {//也可以直接用.class,但需要更多时间
                Thread.sleep(100);
                System.out.println("MONITOR");
                System.out.println("======" + i + "=====");
            }
        }
    }
}