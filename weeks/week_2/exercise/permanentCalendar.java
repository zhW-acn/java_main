package weeks.week_2.exercise;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Description: 输入年和月打印这个月的日
 * @author: acn
 * @date: 2023/09/13/11:33
 */
public class permanentCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // 获取用户输入的年份和月份
        int year = 0;
        int month = 0;

        year = 2024;
        month = 2;

        // 设置 Calendar 实例的年份和月份
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // 月份从 0 开始，需要减 1

        // 打印月份标题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        System.out.println(sdf.format(calendar.getTime()));

        // 打印星期标题
        System.out.println("\t日\t一\t二\t三\t四\t五\t六");

        // 获取该月的第一天是星期几，并打印之前的空格
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("\t");
        }

        // 获取该月的最大天数
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 打印该月的所有天数
        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("\t"+ day);

            // 如果是星期六，换行
            if (dayOfWeek == Calendar.SATURDAY) {
                System.out.println();
            }

            // 增加一天
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        }
    }

}
