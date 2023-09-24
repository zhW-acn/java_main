package months.month_1.week_1.exercise;

import java.util.Scanner;

/**
 * @Description: 打印空心三角形
 * @author: acn
 * @date: 2023/09/07/11:36
 */
public class PrintTriangle {
    public static void main(String[] args) {
        System.out.println("输入长度:");
        int length = new Scanner(System.in).nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) { // 打印前面的空格
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == length) { // 是否是第一个字符，是否是最后一个字符，该行是否为三角形底部
                    System.out.print("*"); // 打印三角形的边缘
                }
                else {
                    System.out.print(" "); // 打印内部空格
                }
            }
            System.out.println(); // 换行
        }
    }
}
