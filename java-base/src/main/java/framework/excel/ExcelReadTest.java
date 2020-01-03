package framework.excel;
/**
 * @Auther: ltc
 * @Date: 2019/12/13 14:27
 * @Description:
 */

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class ExcelReadTest {
    public static void main(String[] args) throws Exception {
        try (InputStream in = new FileInputStream("F:\\test\\test.xlsx");) {
            AnalysisEventListener<List<String>> listener = new AnalysisEventListener<List<String>>() {

                @Override
                public void invoke(List<String> object, AnalysisContext context) {
                    System.err.println("Row:" + context.getCurrentRowNum() + " Data:" + object);
                }

                @Override
                public void doAfterAllAnalysed(AnalysisContext context) {
                    System.err.println("doAfterAllAnalysed...");
                }
            };
            ExcelReader excelReader = ExcelReaderFactory.getExcelReader(in, null, listener, true);
            excelReader.read();
        }
    }
}
