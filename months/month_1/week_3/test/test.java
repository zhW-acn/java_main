package months.month_1.week_3.test;

import java.io.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/18/14:34
 */
public class test {

    public static String sourcePath = "F:\\java_main\\weeks\\week_3\\exercise\\targetDir\\a.txt";
    public static String targetPath = "F:\\java_main\\weeks\\week_3\\exercise\\targetDir\\a\\a.txt";

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream(sourcePath);
             OutputStream os = new FileOutputStream(targetPath)) {
            byte[] bytes = new byte[is.available()];
            is.read(bytes);
            os.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//            byte[] buf = new byte[1024 * 1024];
//            int len;
//            while ((len = is.read(buf)) != -1) {
//                os.write(buf, 0, len);
//            }
}

enum Season{
    SPRING;

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}