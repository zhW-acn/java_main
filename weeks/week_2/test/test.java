package weeks.week_2.test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/11/14:10
 */
public class test {

    public static void main(String[] args) {
//        Collection collection = new ArrayList();
//        ArrayList arrayList = new ArrayList();
//
//        Set set = new HashSet<>();
//        String s1 = new String("123");
//        set.add(s1);
//        set.add("123");
//        System.out.println(set);
//        System.out.println(s1.hashCode() == "123".hashCode());
//
//        TreeSet treeSet = new TreeSet<>(new Comparator<Object>() {// 内部类
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
//
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        String s1 = "1" + "2" + "3www";
//        StringBuffer s2 = new StringBuffer(Integer.MAX_VALUE - 9);
//        System.out.println(s2.length() + " " + s2.capacity());

//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2000);
//        calendar.set(Calendar.MONTH, 7);
//        calendar.set(Calendar.DAY_OF_MONTH, 8);
//        calendar.set(Calendar.HOUR, 5);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
        Map integerHashMap = new HashMap<>();
        integerHashMap.put(1,1);

        System.out.println(integerHashMap.size());
    }
}
