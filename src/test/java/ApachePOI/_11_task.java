package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _11_task {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/resource/TestSonuclari.xlsx";

        String testName="Test Name";
        String testResult="Test Passed";

        writeToExcel(path, testName,testResult); // create excel
        writeToExcel(path, testName,testResult); // now it is updated
        writeToExcel(path, testName,testResult);
        writeToExcel(path, testName,testResult);
        writeToExcel(path, testName,testResult);

    }
public static void writeToExcel(String path,String testName, String testResult){
        try {

            File dosya = new File(path);
            if (!dosya.exists()) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet= workbook.createSheet("Page 1");
                Row newRow= sheet.createRow(0);
                Cell newCell= newRow.createCell(0);
                newCell.setCellValue(testResult);
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
                newCell.setCellValue(testResult);
                FileOutputStream outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                System.out.println("the folder is updated");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


}
}
