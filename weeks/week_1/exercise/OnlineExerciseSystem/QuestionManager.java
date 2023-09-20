package weeks.week_1.exercise.OnlineExerciseSystem;

import java.io.*;
import java.util.*;

/**
 * @Description: 题目管理类
 * @author: acn
 * @date: 2023/09/07/14:08
 */
public class QuestionManager {

    public static TreeSet<Question> questions = new TreeSet<>(new Comparator<Question>() {
        @Override
        public int compare(Question o1, Question o2) {
            return o1.getNumber() - o2.getNumber();
        }
    });

    /**
     * 录入题目
     *
     * @param question
     */
    public static void inputQuestion(Question question) {
        try (OutputStream outputStream = new FileOutputStream(Question.PATH, true);// true,追加
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            // 写一个对象到磁盘 序列化
            objectOutputStream.writeObject(question);
//        objectOutputStream.writeChar('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取题目类至list，返回该list
     *
     * @return List
     */
    public static TreeSet<Question> reloadAllQuestion() {

        try (FileInputStream fis = new FileInputStream(Question.PATH);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
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
     *
     * @param question
     * @return
     */
    public static boolean isRepetition(Question question) {
        TreeSet<Question> allQuestions = reloadAllQuestion();
        for (Question targetQuestion : allQuestions) {
            if (targetQuestion.getNumber() == question.getNumber()) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印所有题目
     */
    public static void printAllQuestion() {
        TreeSet<Question> questions = reloadAllQuestion();
        for (Question question : questions) {
            System.out.println(question.toString());
        }
    }

    /**
     * 返回题库题数
     * @return num
     */
    public static int questionsNum() {
        int num = 0;
        TreeSet<Question> questions = reloadAllQuestion();
        for (Question question : questions) {
            num++;
        }
        return num;
    }

    /**
     * 批量插入题目
     * @param count
     */
    public static void batchImportQuestions(int count) {
        for (int i = 1; i <= count; i++) {
            QuestionManager.inputQuestion(new Question(i, "第" + i + "题的描述"));
        }
    }

    /**
     * 选择10题
     * @return
     */
    public static TreeSet<Question> selectQuestions() {
        int randomNum = (int) (Math.random() * (QuestionManager.questionsNum() - 10 + 1));
        TreeSet<Question> startQuestion = new TreeSet<>(new Comparator<Question>() {
            @Override
            public int compare(Question o1, Question o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });
        int selectNum = 11; //取10个
        for (Question question : questions) {
            if (question.getNumber() == randomNum || selectNum <= 10) {
                selectNum--;
                if (selectNum == 0) {
                    break;
                }
                startQuestion.add(question);
            }
        }
        return startQuestion;
    }

    public static void main(String[] args) {
        System.out.println(selectQuestions());
    }


}