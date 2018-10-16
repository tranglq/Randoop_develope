package trang;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import trang.Objects.KeyWordInValue;


public class GenMethod {
	public void GenMethod() throws FileNotFoundException {
		FileDescription filedes = new FileDescription();
		filedes.setFileDest("E:\\Project\\MVN\\GenValue\\");
		filedes.setFileName("methodlist.txt");
		String linkfile = filedes.getFileDest() + filedes.getFileName();
		FileOutputStream fileos = new FileOutputStream(linkfile);
		DataOutputStream dataos = new DataOutputStream(fileos);
		
		
	}
	
	public void GenValue() throws FileNotFoundException {
		FileDescription filedes = new FileDescription();
		filedes.setFileDest("E:\\Project\\MVN\\GenValue\\");
		filedes.setFileName("values.txt");
		String linkfile = filedes.getFileDest() + filedes.getFileName();
		
		FileOutputStream fileos = new FileOutputStream(linkfile);
		ObjectOutputStream writeob = new ObjectOutputStream(fileos);
		
		KeyWordInValue keyword;
		writeob.writeObject(keyword.getStart());
		writeob.writeObject(arg0);
		
		
	}
}
