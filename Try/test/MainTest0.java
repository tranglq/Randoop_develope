import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest0 {
    public static boolean debug = false;

    @Test
    public void test1() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.tranglua.Main main0 = new com.tranglua.Main();
        java.lang.Class<?> wildcardClass1 = main0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        int int2 = com.tranglua.Main.DevCal((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        int int2 = com.tranglua.Main.DevCal((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test5() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        int int2 = com.tranglua.Main.DevCal((int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + int2 + "' != '" + 10 + "'", int2, 10);
    }

    @Test
    public void test6() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        int int2 = com.tranglua.Main.DevCal((-36), 0);
        org.junit.Assert.assertEquals("'" + int2 + "' != '" + (-36) + "'", int2, (-36));
    }

    @Test
    public void test7() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        int int2 = com.tranglua.Main.SumCal(0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + int2 + "' != '" + 1 + "'", int2, 1);
    }

    @Test
    public void test8() throws Exception {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        int int2 = com.tranglua.Main.SumCal((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + int2 + "' != '" + 10 + "'", int2, 10);
    }
}
