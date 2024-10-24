package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite2 {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/NewExcelFile.xlsx";

        File dosya = new File(path);
        if (!dosya.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet= workbook.createSheet("Page 1");
            Row newRow= sheet.createRow(0);
            Cell newCell= newRow.createCell(0);
            newCell.setCellValue("Hello World 1");
            FileOutputStream outputStream=new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("the folder is created");

        } else {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);
            int lastRow= sheet.getPhysicalNumberOfRows();
            Row newRow= sheet.createRow(lastRow);
            Cell newCell= newRow.createCell(0);
            newCell.setCellValue("Hello World " + (lastRow+1));
            FileOutputStream outputStream=new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("the folder is updated");
        }
    }
}
