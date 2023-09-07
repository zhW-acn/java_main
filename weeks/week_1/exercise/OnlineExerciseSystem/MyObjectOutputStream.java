package weeks.week_1.exercise.OnlineExerciseSystem;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/07/17:16
 */
public class MyObjectOutputStream extends ObjectOutputStream{
    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected MyObjectOutputStream() throws IOException, SecurityException {
    }

    public void writeStreamHeader(){}//这里覆写父类中的方法，使他调用writeObject()的时候不写入文件头
}

