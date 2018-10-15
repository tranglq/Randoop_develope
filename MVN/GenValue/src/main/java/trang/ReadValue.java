package trang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import trang.FileDescription;
import trang.Objects.Package;

public class ReadValue {
	public boolean CheckFile(FileDescription filedes) {
		File fo = new File(filedes.getFileDest());
		
			if(fo.exists()) {
				File file = new File(filedes.getFileDest()+filedes.getFileName());
				if(file.exists()) return true;
				else return false;
			}
			else return false;
		
	}
	
	public void ReadPackage(FileDescription filedes) throws IOException {
		List<Package> packlist = new ArrayList<>();
		if(CheckFile(filedes)) {
			FileInputStream input = new FileInputStream(new File(filedes.getFileDest()+filedes.getFileName()));
			HSSFWorkbook workbook = new HSSFWorkbook(input);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowiterator = sheet.iterator();
			
			while(rowiterator.hasNext()) {
				Row row = rowiterator.next();
				Iterator<Cell> celliterator = row.cellIterator();
				
				while(celliterator.hasNext()) {
					Cell cell = celliterator.next();
					
					CellType celltype = cell.getCellType();
					
					switch (celltype) {
					case _NONE:
						break;
					case STRING:
						String value = cell.getStringCellValue();
						int indexcol = cell.getColumnIndex();
						int indexrow = cell.getRowIndex();
						Package pack = null;
						switch (indexcol) {
						case 0:
							pack.setPackage(value);
						case 1:
							pack.setClass(value);
						case 2:
							pack.setMethod(value);
						case 3:
							pack.setTypeName(value);
						case 4:
							pack.setValue(value);
						case 5:
							pack.setValue(value);
						case 6:
							pack.setValue(value);
						case 7:
							pack.setValue(value);
						case 8:
							pack.setValue(value);
						case 9:
							pack.setValue(value);
						case 10:
							pack.setValue(value);
						}
										
					}
				}
			}
		}
		
		
	}
	
}
