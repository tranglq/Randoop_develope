package trang;

import java.util.Scanner;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class MyMatrix{
	private double [][] matrix;
	
	public MyMatrix(){
		this(3,3);
	}
	
	public MyMatrix(int m, int n){
		this(m,n,0);
	}
	
	public MyMatrix(int m, int n, double a){
		for(int i=0;i<m;i++){
			for (int j =0; j<n;j++){
				this.matrix[i][j] = a;
			}
		}
	}
	
	public void setMatrix(int x, int y, double i){
		this.matrix[x][y] = i;
	}
	
	public void setMatrix(int x, int y){
		double value;
	
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< x; i++){
			for(int j=0; j<y; j++){
				value = scan.nextDouble();
				setMatrix(i,j,value);
			}
		}
		scan.close();
	}
	
	public double getMatrix(int x, int y){
		return this.matrix[x][y];
	}
	
	public double [][] get() {
		return this.matrix;
	}
	
	public static MyMatrix add(MyMatrix m1, MyMatrix m2){
		int lengthx = m1.get().length;
		int lengthy = m2.get()[0].length;
		MyMatrix result = new MyMatrix(lengthx, lengthy);
		
		try{
			if( m1.get().length == m2.get().length || m1.get()[0].length == m2.get()[0].length)
			{
				for(int i=0; i< m1.get().length; i++){
					for(int j=0; j< m1.get()[0].length;j++){
						double m1ij = m1.getMatrix(i,j);
						double m2ij = m2.getMatrix(i,j);
						double value = m1ij + m2ij;
						result.setMatrix(i,j,value);
					}
				}
			}
		} catch(Exception e){
			System.out.print("Can't add 2 matrix");
		}
		return result;
	}
	
	public MyMatrix add(MyMatrix m1){
		RealMatrix realthis = new Array2DRowRealMatrix(this.matrix);
		RealMatrix realm1 = new Array2DRowRealMatrix(m1.matrix);
		RealMatrix realresult = realthis.add(realm1);
		
		int x = realresult.getData().length;
		int y = realresult.getData()[0].length;
		MyMatrix result = new MyMatrix(x,y);
		result.matrix = realresult.getData();
		return result;
	}
	
	public MyMatrix sub(MyMatrix m1) {
		RealMatrix realthis = new Array2DRowRealMatrix(this.matrix);
		RealMatrix realm1 = new Array2DRowRealMatrix(m1.matrix);
		RealMatrix realresult = realthis.subtract(realm1);
		int x = realresult.getData().length;
		int y = realresult.getData()[0].length;
		
		MyMatrix result = new MyMatrix(x,y);
		result.matrix = realresult.getData();
		
		return result;
	}
	
	public MyMatrix multi(MyMatrix m1) {
		RealMatrix realthis = new Array2DRowRealMatrix(this.matrix);
		RealMatrix realm1 = new Array2DRowRealMatrix(m1.matrix);
		RealMatrix realresult = realthis.multiply(realm1);
		int x = realresult.getData().length;
		int y = realresult.getData()[0].length;
		
		
		MyMatrix result = new MyMatrix(x,y);
		result.matrix = realresult.getData();
		
		return result;
	}
	
	public int addab(int a, int b){
		return a+b;
	}
	
	public int subab(int a, int b){
		return a-b;
	}
}