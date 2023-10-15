package months.month_1.week_2.test;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/15/13:06
 */
public abstract class A {
    public abstract void a();
}

abstract class B extends A {
    @Override
    public void a() {
        System.out.println("B的a");
    }

    public abstract void b();
}

class C extends B {
    @Override
    public void b() {
        System.out.println("C的b");
    }

    public static void main(String[] args) {
        A a = new C();
        a.a();
    }
}