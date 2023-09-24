package months.month_1.week_3.exercise;

import java.io.File;

/**
 * @Description: 指定文件夹路径，遍历所有文件
 * @author: acn
 * @date: 2023/09/18/11:59
 */
public class FileGetAll {
    public static void main(String[] args) {
        get(new File("F:\\java_main\\weeks\\week_3\\exercise\\targetDir"));
    }

    public static void get(File path) {
        File[] files = path.listFiles();
        if (files == null)
            return;
        for (File file : files) {
            if (file.isDirectory()) { // 是文件夹->递归，
                System.out.println("文件夹--------------" + file.getName());
                get(file);
            } else if (file.isFile()) {
                System.out.println(file.getName());
            } else {
                System.out.println("???");
            }
        }
    }
}
