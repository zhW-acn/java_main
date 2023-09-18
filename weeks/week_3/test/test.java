package weeks.week_3.test;

import java.io.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/18/14:34
 */
public class test {

    public static String sourcePath = "";
    public static String targetPath = "";

    public static void main(String[] args) {
        try(InputStream is = new FileInputStream(sourcePath);
            OutputStream os = new FileOutputStream(targetPath)){
            byte[] b = new byte[is.available()];
            os.write(b);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
