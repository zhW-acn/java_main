package months.month_1.week_3.exercise.ExcelReadWrite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

/**
 * @Description:  写入Excel
 * @author: acn
 * @date: 2023/09/20/10:53
 */
public class Write {
    public static void write(Problem p) throws IOException {
        ArrayList<Problem> problems = Read.read();
        problems.add(p);

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Sheet1");
        XSSFRow row;
        XSSFCell cell;
        int rowNum = 0;
        int i;
        for (Problem problem : problems) {
            i = 0;
            row = sheet.createRow(rowNum);
            cell = row.createCell(i++);
            cell.setCellValue(problem.getId());
            cell = row.createCell(i++);
            cell.setCellValue(problem.getStem());
            cell = row.createCell(i++);
            cell.setCellValue(problem.getOptionA());
            cell = row.createCell(i++);
            cell.setCellValue(problem.getOptionB());
            cell = row.createCell(i++);
            cell.setCellValue(problem.getOptionC());
            cell = row.createCell(i++);
            cell.setCellValue(problem.getOptionD());
            cell = row.createCell(i);
            cell.setCellValue(problem.getAnswer());
            rowNum++;
        }

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\GitHub\\java_main\\weeks\\week_3\\exercise\\ExcelReadWrite\\题目.xlsx");
        wb.write(fileOutputStream);
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        write(new Problem("1", "1", "1", "1", "1", "1", "1"));
    }
}
