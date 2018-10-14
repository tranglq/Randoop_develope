package trang.Objects;

import java.util.ArrayList;
import java.util.List;

public class Values  {
	private String packagename;
	private String classname;
	private List<Method> methodlist = new ArrayList<>();
	
	public Values() {
		
	}
	
	public Values(String packagename, String classname, List<Method> methodnamelist) {
		this.packagename = packagename;
		this.classname = classname; 
		this.methodlist = methodnamelist;
		
	}
	
	public void setPackage(String packagename) {
		this.packagename = packagename;
	}
	
	public String getPackage() {
		return this.packagename;
	}
	
	public void setClass(String classname) {
		this.classname = classname;
	}
	
	public String getClassname() {
		return this.classname;
	}
	
	public void setAMethod(Method methodname) {
		this.methodlist.add(methodname);
	}
	
	public Method getAMethod(int index) {
		return this.methodlist.get(index);
	}
	
}
