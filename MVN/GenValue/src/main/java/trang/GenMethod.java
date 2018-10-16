package trang;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import trang.Objects.KeyWordInValue;
import trang.Objects.Package;


public class GenMethod {
	public void GenMethod() throws FileNotFoundException {
		FileDescription filedes = new FileDescription();
		filedes.setFileDest("E:\\Project\\MVN\\GenValue\\");
		filedes.setFileName("methodlist.txt");
		String linkfile = filedes.getFileDest() + filedes.getFileName();
		FileOutputStream fileos = new FileOutputStream(linkfile);
		DataOutputStream dataos = new DataOutputStream(fileos);
		
		
	}
	
	public void GenValue() throws IOException {
		FileDescription filesource = new FileDescription();
		filesource.setFileDest("E:\\\\Project\\\\MVN\\\\GenValue\\\\");
		filesource.setFileName("Value.xlsx");
		
		ReadValue readvalue = new ReadValue();
		List<Package> packlist = readvalue.readPackage(filesource);
		
		FileDescription filedes = new FileDescription();
		filedes.setFileDest("E:\\Project\\MVN\\GenValue\\");
		filedes.setFileName("values.txt");
		String linkfile = filedes.getFileDest() + filedes.getFileName();
		
		FileOutputStream fileos = new FileOutputStream(linkfile);
		ObjectOutputStream writeob = new ObjectOutputStream(fileos);
		
		KeyWordInValue keyword = new KeyWordInValue();
		
		Package pack = new Package();
		pack = packlist.get(0);
		int i = 0;
		while(!packlist.isEmpty()) {
			//In ra các từ khóa và tên package.class khi đây là package đầu tiên
			//hoặc tên package khác tên package trc đó
			//hoặc tên class khác tên class liền trước nó
			if(i == 0 
					|| packlist.get(i).getPackage() != packlist.get(i-1).getPackage() 
					|| packlist.get(i).getClassname() != packlist.get(i-1).getClassname())
			{
				writeob.writeObject(keyword.getStart() + "\n");
				writeob.writeObject(keyword.getClassKey() + "\n");
				writeob.writeObject(packlist.get(i).getPackage() + "." + packlist.get(i).getClassname() + "\n");
				writeob.writeObject(keyword.getLit() + "\n");
			}
			
			int j = 0;
			
			//Chạy vòng lặp in ra các giá trị khi:
			// value ko rỗng
			// và 
				//hoặc là đây là package duyệt đầu tiên
				//hoặc là tên class của package này giống tên class của package liền trước nó
			while(!packlist.get(i).getValues().isEmpty() 
					&& (i == 0 || packlist.get(i).getClassname() == packlist.get(i-1).getClassname())) 
			{
				writeob.writeObject(packlist.get(i).getTypeName() + ":" + packlist.get(i).getValueList(j) + "\n");
			}
			
			//In ra từ khóa kết thúc khi
			//Hoặc đây là package cuối
			//Hoặc tên package khác tên package liền sau nó
			//Hoặc tên class khác tên package liền sau nó
			if(i == packlist.size() || 
					(packlist.get(i).getPackage() != packlist.get(i+1).getPackage() ||
					packlist.get(i).getClassname() != packlist.get(i+1).getClassname())) 
			{
				writeob.writeObject(keyword.getEnd());
			}
			
			i++;
		}
			
		
	}
}
