package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_Task_GetSpecificData {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word you wanted to search for: ");
            String searchedWord=input.nextLine();

            String result=read(searchedWord, path);

        System.out.println("result: " + result);
    }

    public static String read(String str, String path) throws IOException {
        String returnedData="";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(str)) {
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnedData=returnedData+" " + sheet.getRow(i).getCell(j);
                }
                }}
        return returnedData;
    }
}
