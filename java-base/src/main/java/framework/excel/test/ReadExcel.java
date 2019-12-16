package framework.excel.test;

import framework.excel.model.UserEx;
import framework.excel.utils.ExcelUtil;
import org.apache.poi.util.IOUtils;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Auther: ltc
 * @Date: 2019/12/13 15:09
 * @Description:
 */

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("F:\\test\\test.xlsx");
        MultipartFile multipartFile = new MockMultipartFile("file", "test.xlsx", "text/plain", IOUtils.toByteArray(in));
        ExcelUtil.readExcel(multipartFile, new UserEx());
    }
}
