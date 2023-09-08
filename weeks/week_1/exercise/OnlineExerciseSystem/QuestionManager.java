package weeks.week_1.exercise.OnlineExerciseSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 题目管理类
 * @author: acn
 * @date: 2023/09/07/14:08
 */
public class QuestionManager {

    /**
     * 录入题目
     *
     * @param question
     */
    public static void inputQuestion(Question question) {
        try (OutputStream outputStream = new FileOutputStream(Question.PATH, true);// true,追加
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {
            // 写一个对象到磁盘 序列化
            objectOutputStream.writeObject(question);
//        objectOutputStream.writeChar('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取题目类至list，返回该list
     * @return List
     */
    public static List<Question> reloadAllQuestion() {

        List<Question> questions = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(Question.PATH);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            while (true) {
                try {
                    // 拿到对象 反序列化
                    questions.add((Question) ois.readObject());
                    byte[] head = new byte[4]; // 跳过读取头信息。不跳过会报 invalid type code: AC
                    fis.read(head);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


//        List<Question> questionsList = new ArrayList<>();
//        try (Writer writer = new FileWriter(Question.PATH);
//             BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        ) {
//            for (Question questions : questionsList) {
//                bufferedWriter.write("Question" + questions.getNumber() + ":" + questions.getDescribe() + " ");
//                bufferedWriter.newLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return questions;
    }

    /**
     * 如果已存在题目编号，返回false
     * @param question
     * @return
     */
    public static boolean isRepetition(Question question) {
        List<Question> allQuestions = reloadAllQuestion();
        for(Question targetQuestion :allQuestions){
            if(targetQuestion.getNumber() == question.getNumber()) {
                return false;
            }
        }
        return true;
    }

    public static void printAllQuestion(){
        List<Question> questions = reloadAllQuestion();
        for(Question question : questions){
            System.out.println(question.toString());
        }
    }

}
