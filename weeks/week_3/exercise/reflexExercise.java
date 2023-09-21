package weeks.week_3.exercise;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description: 遍历属性方法构造器
 * @author: acn
 * @date: 2023/09/21/10:43
 */
public class reflexExercise {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("org.apache.commons.dbutils.AsyncQueryRunner");
        System.out.println("全限定类名：" + clazz);

        // 构造器
        Constructor[] cs = clazz.getConstructors();// 获得所有构造器
        int i = 1;
        for (Constructor c : cs) {
            System.out.println("第" + i++ + "个构造器：" + c);
        }

        i = 1;

        // 方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("第" + i++ + "个方法：" + method);
        }
        i = 1;
        // 属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("第" + i++ + "个属性：" + field);
        }
    }
}
