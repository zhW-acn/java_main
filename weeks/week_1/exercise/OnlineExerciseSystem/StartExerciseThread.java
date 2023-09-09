package weeks.week_1.exercise.OnlineExerciseSystem;

import lombok.Data;

import java.util.*;

/**
 * @Description: 模拟考试的进程。
 * @author: acn
 * @date: 2023/09/09/10:48
 */

public class StartExerciseThread implements Runnable {

    public static Scanner scanner = new Scanner(System.in);
    public static int correctQuestion = 0;

    @Override
    public void run() {
        if (!canWeStartExercise()) {
            System.out.println("题库不足10题，无法开始考试");
            return;
        }
        System.out.println("模拟考试场景，答错0，答对1。开始答题");
        for (Question question : QuestionManager.selectQuestions()) {
            System.out.println("第" + question.getNumber() + "题：" + question.getDescribe());
            if (1 == scanner.nextInt()) {
                correctQuestion++;
            }
        }
    }

    // 是否可以答题
    public static boolean canWeStartExercise() {
        return QuestionManager.questionsNum() >= 10;
    }

}
