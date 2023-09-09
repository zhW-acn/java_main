package weeks.week_1.exercise.OnlineExerciseSystem;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.Scanner;

/**
 * @Description: 工具类
 * @author: acn
 * @date: 2023/09/07/13:13
 */
public class Tools {
    /**
     * 这个计时器用于管理考试线程，不用输出
     */
    @Data
    static class TimerCountThread implements Runnable {
        public static int second = 0;// 秒

        @SneakyThrows
        @Override
        public void run() {
            Thread exerciseThread = new Thread(new StartExerciseThread());
            exerciseThread.start();
            while (second < 60 * 3) {// 三分钟
                if (!exerciseThread.isAlive()) {// 如果线程死亡就跳出
                    break;
                }
                second++;
                Thread.sleep(1000);
            }
            System.out.println("考试结束");
        }
    }

    /**
     * 打印菜单
     */
    public static void printMenu() {
        System.out.println("--------------");
        System.out.println("请选择操作：");
        System.out.println("1. 录入题目");
        System.out.println("2. 开始考试");
        System.out.println("3. 退出");
        System.out.print("请输入：");
    }

    /**
     * 录入题目
     * @return
     */
    public static Question insertQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入题目");
        System.out.print("请输入题目编号：");
        int num = scanner.nextInt();
        System.out.print("请输入题目描述：");
        String describe = scanner.next();
        Question question = new Question(num, describe);
        if (!QuestionManager.isRepetition(question)) {
            System.out.println("题目编号已存在,请重新录入");
            return null;
        }
        QuestionManager.inputQuestion(question);
        QuestionManager.printAllQuestion();
        return question;
    }

    /**
     * 开始考试
     */
    public static void startExercise() {
        Thread timerCountThread = new Thread(new TimerCountThread());// 启动计时器
        timerCountThread.start();
        try {
            timerCountThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!timerCountThread.isAlive() && StartExerciseThread.canWeStartExercise()) {// 是否进行了考试
            System.out.println("\n你做对了" + StartExerciseThread.correctQuestion + "题，用时" + TimerCountThread.second + "秒");
        }
    }
}
