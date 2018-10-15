package trang.Objects;

import java.util.ArrayList;
import java.util.List;

public class Package  {
	private String packagename;
	private String classname;
	private List<Method> methodlist = new ArrayList<>();
	
	public Package() {
		
	}
	
	public Package(String packagename, String classname, List<Method> methodnamelist) {
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
	
	public List<Method> getMethodList(){
		return this.methodlist;
	}
	
	public boolean methodlistIsNull() {
		if(methodlist.get(0) == null) return true;
		else return false;
	}
	
}
