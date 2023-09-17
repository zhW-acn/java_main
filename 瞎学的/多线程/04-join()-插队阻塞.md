
- 当一个线程调用另一个线程的 join 方法时，**调用线程**会被阻塞，直到被调用 join 方法的线程执行完毕。

- 被调用 join 方法的线程不会受到影响，它会继续执行自己的任务，不会等待调用线程。

- 一旦被调用 join 方法的线程执行完毕，调用线程会解除阻塞状态，继续执行。

``` java
main(String[] args) {
    Thread t1 = new Thread(()->{
        Thread.sleep(2000);
        System.out.println("=====t1======");
    });

    Thread t2 = new Thread(()->{
        Thread.sleep(3000);
        System.out.println("=====t2======");
    });

    t1.start();
    t2.start();

    t1.join(); // 等待t1执行(插队)


    System.out.println("====main=====");
}

```