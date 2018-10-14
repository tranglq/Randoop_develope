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
        trang.MyMatrix myMatrix3 = new trang.MyMatrix((int) (short) 1, 0, (double) (byte) -1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        trang.MyMatrix myMatrix3 = new trang.MyMatrix(0, (int) (byte) 0, (double) '#');
    }
}

