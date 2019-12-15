package framework.excels.utils;

import framework.excels.model.ExcelModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteExcel {

    public static void main(String[] args) {
        String filePath = "F://write.xlsx";
        ArrayList<ExcelModel> data = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ExcelModel excelModel = new ExcelModel();
            excelModel.setName("cmj" + i);
            excelModel.setAge(22 + i);
            excelModel.setSchool("清华大学" + i);
            data.add(excelModel);
        }

        ExcelUtil.writeWithTemplate(filePath, data);
    }

    public static void demo() {
        String filePath = "F://write.xlsx";
        List<List<Object>> data = new ArrayList<>();
        data.add(Arrays.asList("111", "222", "333"));
        data.add(Arrays.asList("111", "222", "333"));
        data.add(Arrays.asList("111", "222", "333"));
        List<String> head = Arrays.asList("表头1", "表头2", "表头3");
        ExcelUtil.writeBySimple(filePath, data, head);
    }
}
