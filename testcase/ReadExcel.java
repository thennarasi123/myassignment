package testcase;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] readData(String excelFileName) throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("C:\\Testleaf\\Selenium\\data\\"+excelFileName+".xlsx");
	XSSFSheet ws=wb.getSheet("sheet1");
	int rowCount=ws.getLastRowNum();
	int cellcount=ws.getRow(rowCount).getLastCellNum();
	System.out.println(rowCount);
	System.out.println(cellcount);
	String[][] data=new String[rowCount][cellcount];
	for(int i=1;i<=rowCount;i++) {
	for(int j=0;j<cellcount;j++) {
		String value=ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(value);
		data[i-1][j]=value;
	}
	}
	wb.close();
	return data ;	
}
}
