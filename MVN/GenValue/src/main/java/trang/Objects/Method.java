package trang.Objects;

import java.util.ArrayList;
import java.util.List;

public class Method {
	private String methodname;
	private List<String> typeslist = new ArrayList<>();
	
	public Method(String methodname, List<String> values) {
		this.methodname = methodname;
		this.typeslist = values;
	}
	
	public void setMethod(String methodname) {
		this.methodname = methodname;
	}
	
	public String getMethod() {
		return this.methodname;
	}
	
	public void setAType(String typename) {
		this.typeslist.add(typename);
	}
	
	public String getAtype(int index) {
		return this.typeslist.get(index);
	}
}
