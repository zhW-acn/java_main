public class Son extends Person {
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public Son() {
        System.out.println("子类构造函数");
    }

    public static void main(String[] args) {
        System.out.println(Son.age);
        int i=200;
        byte b=(byte)i;
        System.out.println(b);// -56 溢出

    }
}
