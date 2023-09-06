package weeks.week_1;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/04/15:11
 */
public class Person {
    public static int age = 33;
    public String name;

    public void test(){
    }

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Person() {
        System.out.println("构造函数");
    }
}

