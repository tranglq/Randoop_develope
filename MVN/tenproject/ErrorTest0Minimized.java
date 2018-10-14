import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import trang.MyMatrix;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        new MyMatrix((int) (byte) 1, (int) (byte) 1, (double) (byte) -1);
    }
}
