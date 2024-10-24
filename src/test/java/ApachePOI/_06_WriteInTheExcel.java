package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inputStream);

        Sheet sheet=workbook.getSheetAt(0);

        int lastRow=sheet.getPhysicalNumberOfRows();

        Row newRow= sheet.createRow(lastRow); // create a row to the last row

        Cell newCell= newRow.createCell(0); // new cell created in the new row

        newCell.setCellValue("Hello World");

        inputStream.close(); // close the reading mode

        // save the doc
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream); // write the workbook and save
        workbook.close(); // free the capacity
        fileOutputStream.close(); // close the writing mode

        System.out.println(" Work is done ");



    }
}
