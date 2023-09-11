package weeks.week_1.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Description: 数7游戏，想复杂了，contains就能判断的我还写这么多
 * @author: acn
 * @date: 2023/09/06/10:49
 */
public class SevenPrint {

    public static void main(String[] args) {
        System.out.println("输入终止数字：");
        int num = new Scanner(System.in).nextInt();
        ArrayList<Integer> res = new ArrayList<>();  // 结果集
        boolean ok;// 如果是假，不再进行取余判断
        for (int i = 1; i <= num; i++) {
            ok = true;
            for (int j = 0; j < Tools.getLength(i); j++) { // 当前数字是否有7
                int n = Tools.getIndexOfString(i, j);
                if (7 == n) {
                    res.add(i);
                    ok = false;
                }
            }
            if (ok && 0 == i % 7)
                res.add(i);
        }

        Iterator<Integer> iterator = res.iterator();// 遍历。。好像可以用set去重，前面就不用写那么多判断了，忘了
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Tools{
    /**
     * 返回数字长度，用于循环次数
     * @param num
     * @return int
     */
    public static int getLength(int num) {
        return String.valueOf(num).length();
    }

    /**
     * 这个方法是取数字i第j位的数字，j从高位开始
     * @param i
     * @param j
     * @return int
     */
    public static int getIndexOfString(int i, int j) {// i转String->取第j个字符->转数字
        return Character.getNumericValue(Integer.toString(i).charAt(j));
    }
}
