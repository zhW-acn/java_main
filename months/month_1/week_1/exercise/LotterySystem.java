package months.month_1.week_1.exercise;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description: 抽奖系统的制作
 * 要求控制台录入，开始显示欢迎登陆抽奖系统。请选择操作，1抽奖 2退出系统
 * 1抽奖功能
 * 用户选择1抽奖功能进行抽奖，抽奖的值为随机生成的0-100的自然数，将抽出来的数打印到控制台，显示您是第X位用户，您抽的数为XX，获得的X等奖
 * 95以上为特等奖
 * 85-95之间为一等奖
 * 75-85之间为二等奖
 * 60-75之间为三等奖
 * 其余为安慰奖
 * 最后统计总人数为X，所有人中一等奖占XX%
 * 二等奖占XX%
 * 三等奖占XX%
 * @author: acn
 * @date: 2023/09/06/11:26
 */
public class LotterySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> users = new ArrayList<>();
        int firstPrizeCount = 0;
        int secondPrizeCount = 0;
        int thirdPrizeCount = 0;

        while (true) {
            System.out.println("欢迎登录抽奖系统");
            System.out.println("请选择操作:");
            System.out.println("1. 抽奖");
            System.out.println("2. 退出系统");

            int choice = scanner.nextInt();

            if (1 == choice) {
                int userNumber = users.size() + 1;
                int randomNumber = new Random().nextInt(101); // 生成0-100的随机数
                users.add(randomNumber);

                System.out.println("您是第" + userNumber + "位用户，您抽的数为" + randomNumber + "，获得的奖项为:");

                if (randomNumber >= 95) {
                    System.out.println("特等奖");
                } else if (randomNumber >= 85) {
                    System.out.println("一等奖");
                    firstPrizeCount++;
                } else if (randomNumber >= 75) {
                    System.out.println("二等奖");
                    secondPrizeCount++;
                } else if (randomNumber >= 60) {
                    System.out.println("三等奖");
                    thirdPrizeCount++;
                } else {
                    System.out.println("安慰奖");
                }
            } else if (2 == choice) {
                System.out.println("退出系统");
                break;
            }
        }
        int allUsers = users.size();
        System.out.println("总人数为" + allUsers + "人");
        System.out.println("一等奖占" + firstPrizeCount / allUsers * 100 + "%");
        System.out.println("二等奖占" + secondPrizeCount / allUsers * 100 + "%");
        System.out.println("三等奖占" + thirdPrizeCount / allUsers * 100 + "%");
    }
}
