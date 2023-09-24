package months.month_1.week_2.test;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/12/9:09
 */
public class StringDemo {

    public static void main(String[] args) {
        String s = "bbcabcacba";
        int num = 0;// 用于计数
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='b'){// 循环比较每个索引的值
                num++;
                System.out.println("b字母索引："+ i);
            }
        }
        System.out.println(num);
        num = 0;

        int index = -1;
        while (true) {//
            index = s.indexOf("b", index + 1);
            System.out.println(index);
            if (index == -1) {// 遍历完了
                break;
            }
            num++;
        }
        System.out.println(num);

//        String s = " a c ";
//        String s1 = s.replaceAll(" ", "");
//        System.out.println(s1);
//

    }
}
