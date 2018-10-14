package trang;

import org.apache.commons.math3.linear.RealMatrix;

public class NhanMaTran{
	public RealMatrix Nhan(RealMatrix a1, RealMatrix a2){
		return a1.multiple(a2);
	}
}
