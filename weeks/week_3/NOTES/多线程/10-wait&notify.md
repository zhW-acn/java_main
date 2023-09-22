- wait()释放锁，挂起
- notify()唤醒锁
- notifyAll唤醒所有锁，让它们竞争

线程必须持有这把锁的才能操作这把锁

wait和sleep的区别是：wait会释放锁，sleep不会。他们两都会释放CPU。
``` java
new Thread(()-> {
    synchronized (MONITOR){
        System.out.println("线程1开始了");
        try {
            MONITOR.wait();//释放锁
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("线程1结束了");
    }
},"1").start();


new Thread(()-> {
    synchronized (MONITOR){
        Thread.sleep(100);
        System.out.println("线程2开始了");
        MONITOR.notify();//唤醒锁
        System.out.println("线程2结束了");
    }
},"2").start();
```