package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  Ekrandaki gibi bir Excel Çarpım tablosunu
 *  varolan boş bir excel dosyasına
 *  1 den 10 kadar çarpımlar için yapınız.
 *  (ipucu önce sadece 1 leri yapınız sonra
 *  diğerlerini)
 */
//        1 x 1 = 1
//        1 x 2 = 2
//        1 x 3 = 3
//        1 x 4 = 4
//        1 x 5 = 5
//        1 x 6 = 6
//        1 x 7 = 7
//        1 x 8 = 8
//        1 x 9 = 9
//        1 x 10 = 10

public class _07_task {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/Carpim.xlsx";
        FileInputStream inputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= 10; i++) {
            Row newRow = sheet.createRow(i - 1); // Create a new row for each multiplication

            Cell newCell1 = newRow.createCell(0);
            Cell newCell2 = newRow.createCell(1);
            Cell newCell3 = newRow.createCell(2);
            Cell newCell4 = newRow.createCell(3);
            Cell newCell5 = newRow.createCell(4);

            newCell1.setCellValue(1);
            newCell2.setCellValue("x");
            newCell3.setCellValue(i);
            newCell4.setCellValue("=");
            newCell5.setCellValue(1 * i);
        }

        inputStream.close(); // Close the input stream

        // Save the updated workbook
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream); // Write the updated workbook
        workbook.close();
        fileOutputStream.close();

        System.out.println("Work is done");
    }
}
