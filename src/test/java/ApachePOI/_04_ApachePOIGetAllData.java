package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream inputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inputStream);

        Sheet sheet= workbook.getSheetAt(0);

        int rowCount=sheet.getPhysicalNumberOfRows();
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i <rowCount ; i++) {
            Row row= sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {
                System.out.println(row.getCell(j) + " ");
            }
            System.out.println();
        }

        //2nd way
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.println(sheet.getRow(i).getCell(j)+ " ");
            }
            System.out.println();
        }
        


    }
}
