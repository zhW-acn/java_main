yield()让步

interrupt()中断线程（只有线程在wait和sleep才会捕获InterruptedException异常，**在运行中不会捕获**
``` java
public static void main(String[] args) {
    Thread thread = new Thread(()->{
        System.out.println("begin");
        try {
            Thread.sleep(19999999);
        } catch (InterruptedException e) {
            System.out.println("我被打断了");
            throw new RuntimeException(e);
        }
        System.out.println("end");
    });

    thread.start();
    ThreadUtils.sleep(2000);
    thread.interrupt();
}
```