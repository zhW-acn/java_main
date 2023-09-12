package weeks.week_2.test;

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
//        });palera1n
//
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
        String s1 = "1" + "2" + "3www";
        StringBuffer s2 = new StringBuffer(Integer.MAX_VALUE - 9);
        System.out.println(s2.length()+" "+s2.capacity());
    }
}
