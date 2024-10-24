package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        // there is no excel file
        // so we should create workbook and sheet file in the capacity

        XSSFWorkbook workbook=new XSSFWorkbook(); // workbook in the capacity
        XSSFSheet sheet= workbook.createSheet("Page 1");

        Row newRow= sheet.createRow(0);
        Cell newCell= newRow.createCell(0);
        newCell.setCellValue("Hello World");

        String path="src/test/java/ApachePOI/resource/NewExcelFole.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("the work is done");


    }
}
