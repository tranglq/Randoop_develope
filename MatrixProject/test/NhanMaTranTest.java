import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import nhanmatran.NhanMaTran;

public class NhanMaTranTest {


    @Test
    public void NhanTest1(){
        NhanMaTran nhanMaTran = new NhanMaTran();
        double [][] matrixData1 = {{1d,2d,3d}, {4d,5d,6d}};
        RealMatrix matrix1 = MatrixUtils.createRealMatrix(matrixData1);

        double [][] maxtrixData2 = {{1d,2d}, {3d,4d}, {5d, 6d}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(maxtrixData2);


        Assert.assertEquals(nhanMaTran.Nhan(matrix1,matrix2), matrix1.multiply(matrix2));
    }
}
