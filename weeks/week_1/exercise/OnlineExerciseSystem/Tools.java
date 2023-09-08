package weeks.week_1.exercise.OnlineExerciseSystem;

import java.util.Scanner;

/**
 * @Description: 工具类
 * @author: acn
 * @date: 2023/09/07/13:13
 */
public class Tools {

    public static void printMenu() {
        System.out.println("--------------");
        System.out.println("请选择操作：");
        System.out.println("1. 录入题目");
        System.out.println("2. 开始考试");
        System.out.println("3. 退出");
        System.out.print("请输入：");
    }

    public static Question insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n录入题目");
        System.out.print("请输入题目编号：");
        int num = scanner.nextInt();
        System.out.print("请输入题目描述：");
        String describe = scanner.next();
        Question question = new Question(num, describe);
        if(!QuestionManager.isRepetition(question)){
            System.out.println("题目编号已存在,请重新录入");
            return null;
        }
        QuestionManager.inputQuestion(question);
        QuestionManager.printAllQuestion();
        return question;
    }
}
