package framework.excels.export;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import framework.excels.model.ExcelModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class ExportController {

    /**
     * 导出Excel
     *
     * @param request
     * @param response
     * @param map
     * @throws IOException
     */
    @RequestMapping("export.do")
    public void export(HttpServletRequest request, String type, HttpServletResponse response,
                       @RequestParam Map<String, Object> map) throws IOException {
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String filename;
        String fileName = null;
        try {
            filename = new Date().toLocaleString();
            fileName = new String((filename).getBytes(), "UTF-8");
            Sheet sheet2 = new Sheet(2, 3, ExcelModel.class, "sheet", null);
//            List<ExcelModel> list = service.getData(map);
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("content-Disposition",
                    "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "utf-8"));
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.finish();
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
