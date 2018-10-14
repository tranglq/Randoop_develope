package trang;

import org.apache.common.math3.linear.RealMatrix;
import trang.NhanMaTran;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		double [][] a1 = {{1,2},{3,4},{5,6}};
		double [][] a2 = {{12,23,45},{34,45,56}};
		
		RealMatrix ma1 = MatrixUtils.createRealMatrix(a1);
		RealMatrix ma2 = MatrixUtils.createRealMatrix(a2);
		
		NhanMaTran nhan;
		Sys.out.println(nhan(ma1,ma2));
    }
}
