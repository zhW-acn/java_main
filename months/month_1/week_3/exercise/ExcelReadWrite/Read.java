package months.month_1.week_3.exercise.ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//public class Read {
//    public static ArrayList<Problem> read() {
//        ArrayList<Problem> problems = new ArrayList<>();
//        try {
//            //字节流对象
//            InputStream is = new FileInputStream(new File("F:\\GitHub\\java_main\\weeks\\week_3\\exercise\\ExcelReadWrite\\题目.xlsx"));
//            //工作簿
//            Workbook wb = new XSSFWorkbook(is);
//            //获取表sheet 从0开始
//            Sheet sheet = wb.getSheetAt(0);
//            //创建行对象
//            int rowNum = 0;
//
//            while (true) {
//                //获取到行对象
//                Row r = sheet.getRow(rowNum);
//                if (r == null) {
//                    break;
//                }
//                Problem p = new Problem();
//                p.setId(getCellValue(r.getCell(0)));
//                p.setStem(getCellValue(r.getCell(1)));
//                p.setOptionA(getCellValue(r.getCell(2)));
//                p.setOptionB(getCellValue(r.getCell(3)));
//                p.setOptionC(getCellValue(r.getCell(4)));
//                p.setOptionD(getCellValue(r.getCell(5)));
//                p.setAnswer(getCellValue(r.getCell(6)));
//                problems.add(p);
//                rowNum++;
//            }
//
////			for (int i = 1; i < rowNum; i++) {
////				Row r = sheet.getRow(i);
////				Problem p = new Problem();
////				p.setId(getCellValue(r.getCell(0)));
////				p.setStem(getCellValue(r.getCell(1)));
////				p.setOptionA(getCellValue(r.getCell(2)));
////				p.setOptionB(getCellValue(r.getCell(3)));
////				p.setOptionC(getCellValue(r.getCell(4)));
////				p.setOptionD(getCellValue(r.getCell(5)));
////				p.setAnswer(getCellValue(r.getCell(6)));
////				problems.add(p);
////			}
//
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return problems;
//    }
//
//    //Cell 单元格对象
//    private static String getCellValue(Cell cell) {
//
//        //对象去接收值 （数据格式 JSon）
//        String value = null;
//
//        if (cell != null) {
//            String type = cell.getCellType().toString();
//            switch (type) {
//                case "NUMERIC":  //数字类型
//                    value = String.valueOf((long) cell.getNumericCellValue());
//                    break;
//                case "STRING":  //字符类型
//                    value = cell.getStringCellValue();
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        return value;
//    }
//
//}
