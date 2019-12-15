package framework.excels;

import com.alibaba.excel.metadata.Sheet;
import framework.excels.model.ExcelModel;
import framework.excels.utils.ExcelUtil;

import java.util.List;

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
        //sheet里面可以设置类映射
        Sheet sheet = new Sheet(1, 1, ExcelModel.class);
        List<Object> objects = ExcelUtil.readLessThan1000RowBySheet(filePath, sheet);

        objects.stream().forEach(c -> {
            if (c instanceof ExcelModel) {
                ExcelModel model = (ExcelModel) c;
                System.out.println(model.toString());
            }
        });
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
