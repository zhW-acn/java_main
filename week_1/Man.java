package week_1;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/06/14:40
 */
public class Man {
    //静态变量
    public static int staticVariable = 1;
    //成员变量
    public int objVariable;


    //静态初始代码块
    static {
        staticVariable = 2;
    }

    //对象初始化代码块
    {
        objVariable = 88;
    }

    //构造方法
    public Man() {
        objVariable = 99;
    }

    public static void main(String[] args) {
        Man man = new Man();
    }
}

