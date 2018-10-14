package nhanmatran;


import org.apache.commons.math3.linear.RealMatrix;

public class NhanMaTran {
    public RealMatrix Nhan(RealMatrix matrix1, RealMatrix matrix2){
        return matrix1.multiply(matrix2);
    }


}
