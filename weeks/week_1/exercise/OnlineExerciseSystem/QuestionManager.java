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
     * @throws IOException
     */
    public static void inputQuestion(Question question) throws IOException {
        OutputStream outputStream = new FileOutputStream(Question.PATH, true);// true,追加
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        // 写一个对象到磁盘 序列化
        objectOutputStream.writeObject(question);
        objectOutputStream.close();
    }

    /**
     * 读题
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void reloadAllQuestion() throws IOException, ClassNotFoundException {
        FileInputStream fs = new FileInputStream(Question.PATH);
        ObjectInputStream ois = new ObjectInputStream(fs);
        // 拿到对象 反序列化
        List<Question> questions = new ArrayList<>();
        while(true){
            try{
                System.out.println(ois.readObject());
            }catch (EOFException e){
                break;
            }
        }
        ois.close();

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
//        for(Question question :questions){
//            System.out.println(question);
//        }
    }


}
