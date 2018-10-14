package nhanmatran;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;


public class Main {

    public static void main(String[] args) {
        double [][] matrixData1 = {{1d,2d,3d}, {4d,5d,6d}};
        RealMatrix matrix1 = MatrixUtils.createRealMatrix(matrixData1);

        double [][] maxtrixData2 = {{1d,2d}, {3d,4d}, {5d, 6d}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(maxtrixData2);

        NhanMaTran nhanMaTran = new NhanMaTran();

        RealMatrix result = nhanMaTran.Nhan(matrix1, matrix2);

        System.out.println(result.getRowDimension());
        System.out.println(result.getColumnDimension());
        System.out.println(result.getRowMatrix(0));
    }
}
