import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        nhanmatran.NhanMaTran nhanMaTran0 = new nhanmatran.NhanMaTran();
        java.lang.Class<?> wildcardClass1 = nhanMaTran0.getClass();
        org.apache.commons.math3.linear.RealMatrix realMatrix2 = null;
        org.apache.commons.math3.linear.RealMatrix realMatrix3 = null;
        try {
            org.apache.commons.math3.linear.RealMatrix realMatrix4 = nhanMaTran0.Nhan(realMatrix2, realMatrix3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        nhanmatran.NhanMaTran nhanMaTran0 = new nhanmatran.NhanMaTran();
        org.apache.commons.math3.linear.RealMatrix realMatrix1 = null;
        org.apache.commons.math3.linear.RealMatrix realMatrix2 = null;
        try {
            org.apache.commons.math3.linear.RealMatrix realMatrix3 = nhanMaTran0.Nhan(realMatrix1, realMatrix2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

