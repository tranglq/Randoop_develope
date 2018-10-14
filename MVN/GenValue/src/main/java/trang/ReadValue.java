package trang;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import trang.FileDescription;

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
	
	public String ReadPackage(FileDescription filedes) {
		if(CheckFile(filedes)) {
			FileInputStream input = new FileInputStream(new File(filedes.getFileDest()+filedes.getFileName()));
			HSSFWorkbook workbook = new HSSFWorkbook(input);
			HSSFSheet sheet = workbook.getSheetAt(0);
			sheet.getCe
		}
		
		
	}
	
}
