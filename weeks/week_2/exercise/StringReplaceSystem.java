package weeks.week_2.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: 非法字符替换系统
 * 要求控制台选择操作 1.开启绿色功能 2.关闭绿色功能
 * 选择完毕之后，提示用户输入一段话。
 * 不论是否开始功能，对用户输入的话进行前后去空格处理。
 * 开启功能：对敏感词进行和谐（自定，至少3个敏感词），和谐的格式
 * （例如：qq 和谐之后是XX1，需在后面添加是第几个和谐的敏感词）
 * 统计所有敏感词各自出现的次数，最后将和谐的语句和出现敏感词的次数都显示出来。
 * @author: acn
 * @date: 2023/09/12/10:53
 */
public class StringReplaceSystem {
    public static Scanner scanner = new Scanner(System.in);

    static class Tools {
        private static final Map<String, Integer> N_WORD = new HashMap<>(); // 敏感词

        Tools() {
            N_WORD.put("1", 0);
            N_WORD.put("22", 0);
            N_WORD.put("3", 0);
        }

        /**
         * 打印菜单
         */
        public static void printMenu() {
            System.out.println("1.开启绿色功能 2.关闭绿色功能");
            System.out.println("选择：");
        }

        public static String replaceChar(String target, int model) {
            if (2 == model) {
                return target;
            }
            String resString = target;
            for (String s : N_WORD.keySet()) {
                int index = -1;
                do {
                    index = resString.indexOf(s, index + 1);
                    resString = resString.replace(s, new String(new char[s.length()]).replace('\0', '*'));
                } while (index != -1);
            }
            return resString;
        }

        public static void mapCount(String target) {

            for (String s : N_WORD.keySet()) {
                Integer i = 0;
                int index = -1;
                while (true) {
                    i = N_WORD.get(s);
                    index = target.indexOf(s, index + 1);
                    if(index == -1){
                        break;
                    }
                    i++;
                    N_WORD.put(s, i);
                }

            }
            for (String s : N_WORD.keySet()) {
                System.out.println(s + ":" + N_WORD.get(s));
            }
        }


        public static void main(String[] args) {
            System.out.println(replaceChar("121133444422", 1));
        }
    }

    public static void main(String[] args) {

        Tools.printMenu();
        int input = scanner.nextInt();
        if (1 == input) {
            System.out.println("选择开启绿色功能，输入：");
            String string = scanner.next().trim();
            String replaceChar = Tools.replaceChar(string, 1);
            System.out.println("替换后：" + replaceChar);
            System.out.println("敏感词出现次数：");
            Tools.mapCount(string);
        } else if (2 == input) {
            System.out.println("选择关闭绿色功能，输入：");
            System.out.println(Tools.replaceChar(scanner.next().trim(), 2));
        } else {
            System.out.println("选择有误");
        }
    }
}
