package weeks.week_1.exercise.OnlineExerciseSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @Description: 题目类
 * @author: acn
 * @date: 2023/09/07/13:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    public final static String PATH = "Question.txt";
    private int number;// 序号
    private String describe;// 题目描述

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Question question = new Question();
        QuestionManager.inputQuestion(new Question(1,"描述"));
        QuestionManager.reloadAllQuestion();
    }
}
