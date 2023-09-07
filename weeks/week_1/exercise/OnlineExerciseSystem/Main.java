package weeks.week_1.exercise.OnlineExerciseSystem;

import java.util.Scanner;

/**
 * @Description: 在线答题系统:要求在控制台在线答题，具有计时功能，需要在程序运行的控制台选项
 * 1录入题目（需要创建题目类，属性:序号，题目)
 * 1）需要依次输入题目的序号，题目的内容
 * 2）将题目和序号序列化存入Question.txt中
 * 3）录入题目的时候序号不按大小顺序录入，可自由录入
 * 2开始考试
 * 要求使用多线程，一个线程进行考试，一个用于计时，如果超过3分钟未做完10道，结束考试统计分数。
 * 1）开始考试，如果题库里面的题的数量不足10题，不可选择考试，重新回到选择界面。
 * 2)如果题目数量>=10 题，从题库当中读出所有题目，从(x-10)随机生成一个随机数，从该随机数的 TreeSet集合里第x(即随机数）题开始依次考后面的10个题目）
 * 3）题目放入TreeSet集合排序规则为，以题目类的序号进行从小到大的排序
 * 4）统计分数。如果10题做完，时间未到，统计分数加时间 一题10分
 * 如果时间到了，题目未做完，统计做的题目 一题10分
 * 将成绩，姓名，答题时间录入到数据库保存表为:score
 * @author: acn
 * @date: 2023/09/07/12:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Tools.printMenu();
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("录入题目");
            } else if (input == 2) {
                System.out.println("开始考试");
            } else if (input == 3) {
                System.out.println("退出");
                break;
            } else {
                System.out.println("无效选择");
            }
        }
    }
}
