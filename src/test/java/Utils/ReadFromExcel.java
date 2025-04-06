package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";

    //FileInputStream fileInputStream = new FileInputStream(testDataDir);
    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(testDataDir);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //XSSFWorkbook xssfWorkbook = new XSSFWorkbook();

    public ReadFromExcel() throws IOException {
    }

    static XSSFSheet sheet1 = workbook.getSheet("Login Details");
    static XSSFSheet sheet = workbook.getSheet("User Details");

    public static String username = sheet1.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet1.getRow(1).getCell(1).getStringCellValue();
    public static String firstName = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String lastName = sheet.getRow(1).getCell(1).getStringCellValue();
    //public static String postalCode = sheet.getRow(1).getCell(2).getStringCellValue();

    public static String postalCode;

    static {
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(2);

        if (cell.getCellType() == CellType.STRING) {
            postalCode = cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            postalCode = String.valueOf((int) cell.getNumericCellValue()); // or remove (int) if decimals matter
        } else {
            postalCode = ""; // fallback if needed
        }
    }

    //XSSFWorkbook sheet1 = xssfWorkbook.getSheet("user Details").getWorkbook();
}
//package Utils;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class ReadFromExcel {
//    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";
//    static FileInputStream fis;
//    static XSSFWorkbook workbook;
//    static XSSFSheet sheet1;
//    static XSSFSheet sheet;
//
//    static {
//        try {
//            fis = new FileInputStream(testDataDir);
//            workbook = new XSSFWorkbook(fis);
//            sheet1 = workbook.getSheet("Login Details");
//            sheet = workbook.getSheet("User Details");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException("File not found: " + testDataDir, e);
//        } catch (IOException e) {
//            throw new RuntimeException("Error reading Excel file: " + testDataDir, e);
//        }
//    }
//
//    public static String username = sheet1.getRow(1).getCell(0).getStringCellValue();
//    public static String password = sheet1.getRow(1).getCell(1).getStringCellValue();
//    public static String firstName = sheet.getRow(1).getCell(0).getStringCellValue();
//    public static String lastName = sheet.getRow(1).getCell(1).getStringCellValue();
//    public static String postalCode = sheet.getRow(1).getCell(2).getStringCellValue();
//
//    public ReadFromExcel() throws IOException {
//        // Print debug statements to verify the data
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Postal Code: " + postalCode);
//    }
//}