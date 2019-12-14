package framework.excels;

import com.alibaba.excel.metadata.Sheet;
import framework.excels.model.TableHeaderExcelProperty;
import framework.excels.utils.ExcelUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadExcel {

    public static void main(String[] args) {
//        sheet1All();
        sheet1();
//        sheet2();
//        sheet1More();
    }

    public static void sheet1All() {
        String filePath = "F://demo.xlsx";
        List<Object> objects = ExcelUtil.readLessThan1000Row(filePath);
        System.out.println(objects);
    }

    //获取Sheet1表头以下的信息
    public static void sheet1() {
        String filePath = "F://demo.xlsx";
        //第一个1代表sheet1, 第二个1代表从第几行开始读取数据，行号最小值为0
        Sheet sheet = new Sheet(1, 1);
        List<Object> objects = ExcelUtil.readLessThan1000RowBySheet(filePath, sheet);

        List<ArrayList> collect1 = objects.stream().map(c -> (ArrayList) c).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println((ArrayList) collect1.get(0).get(0));
        System.out.println((ArrayList) collect1.get(1).get(1));
        System.out.println((ArrayList) collect1.get(2).get(2));
        System.out.println(objects);
    }

    public static void sheet1More() {
        String filePath = "F://demo.xlsx";
        List<Object> objects = ExcelUtil.readMoreThan1000Row(filePath);
        System.out.println(objects);
    }

    public static void sheet2() {
        String filePath = "F://demo.xlsx";
        Sheet sheet = new Sheet(2, 0);
        List<Object> objects = ExcelUtil.readLessThan1000RowBySheet(filePath, sheet);
        System.out.println(objects);
    }
}
