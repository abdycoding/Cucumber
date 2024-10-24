package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class justaTask1
{
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/task1.xlsx";
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Page1");
        XSSFSheet sheet1= workbook.createSheet("Page2");

        Row newRow=sheet.createRow(0);
        Row newRow2= sheet1.createRow(0);

        Cell newCell=newRow.createCell(0);
        newCell.setCellValue(" page 1 deki");

        Cell newCell2=newRow2.createCell(0);
        newCell2.setCellValue("page 2 deki");

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("the job is done");
    }
}
