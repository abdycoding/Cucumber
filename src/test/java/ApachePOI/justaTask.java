package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class justaTask
{
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/task.xlsx";

        File file=new File(path);

        if (!file.exists()){
            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheet=workbook.createSheet("Page 1");
            Row newRow= sheet.createRow(0);
            Cell newCell= newRow.createCell(0);
            newCell.setCellValue("Uefa Champions League 1");
            FileOutputStream outputStream=new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("the folder is created");

        }
        else {
            FileInputStream inputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);
            int LastRow= sheet.getPhysicalNumberOfRows();
            Row newRow= sheet.createRow(LastRow);
            Cell newCell= newRow.createCell(0);
            newCell.setCellValue("Uefa Champions League" + (LastRow+1));
            FileOutputStream outputStream= new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("the folder is updated");
        }
    }
}
