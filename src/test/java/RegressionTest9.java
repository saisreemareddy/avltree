import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert(1);
        int int44 = aVLTree0.height();
        AVLTree aVLTree45 = new AVLTree();
        AVLTree.Node node47 = aVLTree45.find((int) '4');
        AVLTree.Node node49 = aVLTree45.find((int) 'a');
        AVLTree.Node node50 = aVLTree45.getRoot();
        AVLTree.Node node51 = aVLTree45.getRoot();
        int int52 = aVLTree45.height();
        aVLTree45.insert((int) 'a');
        aVLTree45.insert((int) (short) 100);
        AVLTree.Node node57 = aVLTree45.getRoot();
        int int58 = aVLTree0.getBalance(node57);
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass61 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node4 = aVLTree0.getRoot();
        int int5 = aVLTree0.height();
        aVLTree0.insert(100);
        AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        AVLTree.Node node9 = aVLTree0.getRoot();
        AVLTree.Node node11 = aVLTree0.find(10);
        aVLTree0.insert(1);
        aVLTree0.insert((int) (byte) 0);
        AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) -1);
        AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.getRoot();
        AVLTree aVLTree8 = new AVLTree();
        AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node19 = aVLTree17.find((int) '4');
        AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        AVLTree.Node node32 = aVLTree0.find((int) (short) 100);
        AVLTree.Node node33 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node10 = aVLTree9.getRoot();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node32 = aVLTree30.find((int) '4');
        AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        AVLTree aVLTree45 = new AVLTree();
        AVLTree.Node node47 = aVLTree45.find((int) '4');
        AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert(0);
        aVLTree45.insert((int) (short) 10);
        AVLTree.Node node54 = aVLTree45.getRoot();
        AVLTree aVLTree55 = new AVLTree();
        AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.insert((int) 'a');
        AVLTree.Node node63 = aVLTree55.find((int) (byte) 100);
        AVLTree aVLTree64 = new AVLTree();
        AVLTree.Node node66 = aVLTree64.find((int) '4');
        aVLTree64.delete((int) 'a');
        AVLTree.Node node69 = aVLTree64.getRoot();
        aVLTree64.delete(0);
        AVLTree.Node node72 = null;
        int int73 = aVLTree64.getBalance(node72);
        int int74 = aVLTree64.height();
        AVLTree aVLTree75 = new AVLTree();
        AVLTree.Node node77 = aVLTree75.find((int) '4');
        AVLTree.Node node78 = aVLTree75.getRoot();
        aVLTree75.delete(100);
        aVLTree75.insert((int) (byte) 10);
        AVLTree.Node node83 = aVLTree75.getRoot();
        int int84 = aVLTree64.getBalance(node83);
        int int85 = aVLTree55.getBalance(node83);
        int int86 = aVLTree45.getBalance(node83);
        int int87 = aVLTree0.getBalance(node83);
        aVLTree0.delete((int) ' ');
        AVLTree.Node node90 = aVLTree0.getRoot();
        AVLTree.Node node92 = aVLTree0.find((int) '#');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find(0);
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert(0);
        aVLTree10.insert((int) (short) 10);
        AVLTree.Node node19 = aVLTree10.getRoot();
        AVLTree aVLTree20 = new AVLTree();
        AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        AVLTree aVLTree29 = new AVLTree();
        AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        AVLTree aVLTree40 = new AVLTree();
        AVLTree.Node node42 = aVLTree40.find((int) '4');
        AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        AVLTree.Node node54 = aVLTree0.find((int) (short) 100);
        AVLTree.Node node56 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AVLTree.Node node9 = aVLTree0.find(10);
        AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(100);
        AVLTree aVLTree12 = new AVLTree();
        AVLTree.Node node14 = aVLTree12.find((int) '4');
        AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) (short) 100);
        AVLTree.Node node20 = aVLTree12.find((int) ' ');
        int int21 = aVLTree12.height();
        aVLTree12.insert((int) 'a');
        AVLTree.Node node25 = aVLTree12.find((-1));
        int int26 = aVLTree12.height();
        int int27 = aVLTree12.height();
        aVLTree12.delete((int) (byte) -1);
        aVLTree12.delete(10);
        AVLTree.Node node32 = aVLTree12.getRoot();
        int int33 = aVLTree0.getBalance(node32);
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        AVLTree.Node node11 = aVLTree0.getRoot();
        AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node19 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.delete((int) (byte) -1);
        int int12 = aVLTree7.height();
        int int13 = aVLTree7.height();
        AVLTree.Node node15 = aVLTree7.find((int) '#');
        AVLTree aVLTree16 = new AVLTree();
        AVLTree.Node node18 = aVLTree16.find((int) '4');
        AVLTree.Node node20 = aVLTree16.find((int) 'a');
        aVLTree16.delete((int) (short) 10);
        AVLTree aVLTree23 = new AVLTree();
        AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        int int32 = aVLTree16.getBalance(node31);
        int int33 = aVLTree7.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        AVLTree.Node node36 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) 'a');
        int int39 = aVLTree0.height();
        aVLTree0.delete(0);
        int int42 = aVLTree0.height();
        AVLTree aVLTree43 = new AVLTree();
        AVLTree.Node node45 = aVLTree43.find((-1));
        aVLTree43.delete(100);
        AVLTree.Node node49 = aVLTree43.find((int) '#');
        AVLTree aVLTree50 = new AVLTree();
        AVLTree.Node node52 = aVLTree50.find((int) '4');
        aVLTree50.delete((int) 'a');
        AVLTree.Node node55 = aVLTree50.getRoot();
        AVLTree.Node node56 = null;
        int int57 = aVLTree50.getBalance(node56);
        AVLTree.Node node59 = aVLTree50.find((int) ' ');
        aVLTree50.insert((-1));
        AVLTree.Node node62 = aVLTree50.getRoot();
        int int63 = aVLTree50.height();
        AVLTree.Node node65 = aVLTree50.find((int) (short) -1);
        aVLTree50.insert((int) ' ');
        AVLTree.Node node68 = aVLTree50.getRoot();
        int int69 = aVLTree43.getBalance(node68);
        AVLTree aVLTree70 = new AVLTree();
        AVLTree.Node node72 = aVLTree70.find((int) '4');
        AVLTree.Node node73 = aVLTree70.getRoot();
        aVLTree70.insert((int) (byte) 100);
        int int76 = aVLTree70.height();
        aVLTree70.insert(1);
        aVLTree70.insert(0);
        AVLTree.Node node81 = aVLTree70.getRoot();
        AVLTree.Node node82 = aVLTree70.getRoot();
        int int83 = aVLTree43.getBalance(node82);
        int int84 = aVLTree0.getBalance(node82);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        AVLTree.Node node21 = aVLTree0.getRoot();
        AVLTree.Node node23 = aVLTree0.find((int) (short) 10);
        AVLTree.Node node25 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        int int28 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        AVLTree.Node node10 = aVLTree0.find((-1));
        AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) '4');
        AVLTree.Node node19 = aVLTree0.getRoot();
        AVLTree aVLTree20 = new AVLTree();
        AVLTree.Node node22 = aVLTree20.find((int) '4');
        AVLTree.Node node23 = null;
        int int24 = aVLTree20.getBalance(node23);
        aVLTree20.insert((int) '4');
        AVLTree.Node node28 = aVLTree20.find((int) '#');
        aVLTree20.insert(0);
        aVLTree20.insert((int) '#');
        aVLTree20.insert(1);
        AVLTree aVLTree35 = new AVLTree();
        AVLTree.Node node37 = aVLTree35.find((int) '4');
        AVLTree.Node node39 = aVLTree35.find((int) 'a');
        aVLTree35.delete((int) (short) 10);
        AVLTree aVLTree42 = new AVLTree();
        AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((int) 'a');
        AVLTree.Node node50 = aVLTree42.find((int) (byte) 100);
        int int51 = aVLTree35.getBalance(node50);
        int int52 = aVLTree35.height();
        aVLTree35.insert(1);
        AVLTree aVLTree55 = new AVLTree();
        AVLTree.Node node57 = aVLTree55.find((int) '4');
        aVLTree55.insert((int) (short) 0);
        AVLTree aVLTree60 = new AVLTree();
        AVLTree.Node node62 = aVLTree60.find((int) '4');
        AVLTree.Node node63 = null;
        int int64 = aVLTree60.getBalance(node63);
        aVLTree60.insert(0);
        AVLTree aVLTree67 = new AVLTree();
        AVLTree.Node node68 = null;
        int int69 = aVLTree67.getBalance(node68);
        aVLTree67.insert((int) (byte) 100);
        aVLTree67.insert((int) 'a');
        AVLTree.Node node74 = aVLTree67.getRoot();
        int int75 = aVLTree60.getBalance(node74);
        int int76 = aVLTree55.getBalance(node74);
        int int77 = aVLTree35.getBalance(node74);
        int int78 = aVLTree20.getBalance(node74);
        int int79 = aVLTree0.getBalance(node74);
        java.lang.Class<?> wildcardClass80 = node74.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        AVLTree aVLTree7 = new AVLTree();
        AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node19 = aVLTree17.find((int) '4');
        AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert(0);
        AVLTree.Node node25 = aVLTree17.find((int) (short) 0);
        int int26 = aVLTree0.getBalance(node25);
        aVLTree0.insert(0);
        AVLTree.Node node29 = aVLTree0.getRoot();
        AVLTree aVLTree30 = new AVLTree();
        AVLTree.Node node31 = aVLTree30.getRoot();
        AVLTree aVLTree32 = new AVLTree();
        AVLTree.Node node34 = aVLTree32.find((int) '4');
        AVLTree.Node node35 = aVLTree32.getRoot();
        AVLTree.Node node37 = aVLTree32.find((int) (short) -1);
        AVLTree aVLTree38 = new AVLTree();
        AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        aVLTree38.delete(100);
        AVLTree aVLTree51 = new AVLTree();
        AVLTree.Node node53 = aVLTree51.find((int) '4');
        AVLTree.Node node54 = aVLTree51.getRoot();
        aVLTree51.delete(100);
        aVLTree51.insert((int) (byte) 10);
        AVLTree.Node node59 = aVLTree51.getRoot();
        int int60 = aVLTree38.getBalance(node59);
        int int61 = aVLTree32.getBalance(node59);
        int int62 = aVLTree30.getBalance(node59);
        AVLTree.Node node64 = aVLTree30.find(10);
        int int65 = aVLTree30.height();
        AVLTree aVLTree66 = new AVLTree();
        AVLTree.Node node68 = aVLTree66.find((int) '4');
        AVLTree.Node node69 = aVLTree66.getRoot();
        aVLTree66.delete(100);
        int int72 = aVLTree66.height();
        AVLTree.Node node74 = aVLTree66.find((int) (short) -1);
        AVLTree.Node node75 = aVLTree66.getRoot();
        AVLTree.Node node77 = aVLTree66.find(1);
        aVLTree66.delete(10);
        int int80 = aVLTree66.height();
        aVLTree66.insert((int) ' ');
        AVLTree aVLTree83 = new AVLTree();
        AVLTree.Node node85 = aVLTree83.find((int) '4');
        AVLTree.Node node86 = aVLTree83.getRoot();
        aVLTree83.delete(100);
        aVLTree83.insert((int) (byte) 10);
        AVLTree.Node node91 = aVLTree83.getRoot();
        int int92 = aVLTree66.getBalance(node91);
        int int93 = aVLTree30.getBalance(node91);
        int int94 = aVLTree0.getBalance(node91);
        java.lang.Class<?> wildcardClass95 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        AVLTree aVLTree8 = new AVLTree();
        AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        AVLTree aVLTree11 = new AVLTree();
        AVLTree.Node node13 = aVLTree11.find((int) '4');
        AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node19 = aVLTree17.find((int) '4');
        AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        AVLTree.Node node32 = aVLTree0.find((int) (short) 10);
        AVLTree.Node node34 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        AVLTree aVLTree16 = new AVLTree();
        aVLTree16.delete((int) (byte) -1);
        aVLTree16.delete((int) (byte) 0);
        aVLTree16.insert((int) (byte) -1);
        aVLTree16.delete(10);
        AVLTree aVLTree25 = new AVLTree();
        AVLTree.Node node27 = aVLTree25.find((int) '4');
        AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        aVLTree25.insert((int) '4');
        AVLTree.Node node33 = aVLTree25.find((int) (short) 0);
        AVLTree.Node node35 = aVLTree25.find((int) ' ');
        aVLTree25.insert((int) (short) 100);
        AVLTree.Node node39 = aVLTree25.find((int) (short) 100);
        AVLTree.Node node40 = aVLTree25.getRoot();
        AVLTree.Node node41 = aVLTree25.getRoot();
        int int42 = aVLTree16.getBalance(node41);
        int int43 = aVLTree0.getBalance(node41);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node6 = aVLTree0.find((int) ' ');
        AVLTree.Node node8 = aVLTree0.find(0);
        AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        AVLTree aVLTree12 = new AVLTree();
        AVLTree.Node node14 = aVLTree12.find((int) '4');
        AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) 'a');
        aVLTree12.delete((int) (byte) 10);
        AVLTree.Node node22 = aVLTree12.find((int) (short) 1);
        AVLTree.Node node23 = aVLTree12.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.delete(100);
        aVLTree0.insert((int) '#');
        AVLTree.Node node29 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AVLTree aVLTree3 = new AVLTree();
        AVLTree.Node node5 = aVLTree3.find((int) '4');
        AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        AVLTree.Node node17 = aVLTree0.getRoot();
        AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        aVLTree0.insert(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(2);
        AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        AVLTree.Node node11 = aVLTree0.getRoot();
        AVLTree.Node node12 = aVLTree0.getRoot();
        AVLTree.Node node14 = aVLTree0.find((int) (byte) -1);
        AVLTree aVLTree15 = new AVLTree();
        AVLTree.Node node17 = aVLTree15.find((int) '4');
        AVLTree.Node node18 = aVLTree15.getRoot();
        aVLTree15.insert((int) (byte) 100);
        int int21 = aVLTree15.height();
        aVLTree15.insert(1);
        aVLTree15.insert(0);
        AVLTree.Node node26 = aVLTree15.getRoot();
        AVLTree.Node node27 = aVLTree15.getRoot();
        int int28 = aVLTree0.getBalance(node27);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node4 = aVLTree0.find((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 10);
        AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        AVLTree.Node node20 = aVLTree0.find((int) (short) 1);
        AVLTree.Node node22 = aVLTree0.find(100);
        java.lang.Class<?> wildcardClass23 = node22.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete(0);
        int int14 = aVLTree0.height();
        AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AVLTree aVLTree3 = new AVLTree();
        AVLTree.Node node5 = aVLTree3.find((int) '4');
        AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        AVLTree aVLTree24 = new AVLTree();
        AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.insert((int) (short) 0);
        AVLTree.Node node30 = aVLTree24.find(100);
        AVLTree aVLTree31 = new AVLTree();
        AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        AVLTree aVLTree42 = new AVLTree();
        AVLTree.Node node44 = aVLTree42.find((int) '4');
        AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        AVLTree aVLTree52 = new AVLTree();
        AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        AVLTree.Node node57 = aVLTree52.getRoot();
        aVLTree52.delete(0);
        AVLTree.Node node60 = null;
        int int61 = aVLTree52.getBalance(node60);
        int int62 = aVLTree52.height();
        AVLTree aVLTree63 = new AVLTree();
        AVLTree.Node node65 = aVLTree63.find((int) '4');
        AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.delete(100);
        aVLTree63.insert((int) (byte) 10);
        AVLTree.Node node71 = aVLTree63.getRoot();
        int int72 = aVLTree52.getBalance(node71);
        int int73 = aVLTree31.getBalance(node71);
        int int74 = aVLTree24.getBalance(node71);
        int int75 = aVLTree0.getBalance(node71);
        AVLTree aVLTree76 = new AVLTree();
        AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        AVLTree.Node node85 = aVLTree76.getRoot();
        AVLTree.Node node87 = aVLTree76.find(10);
        AVLTree.Node node88 = aVLTree76.getRoot();
        AVLTree.Node node89 = aVLTree76.getRoot();
        int int90 = aVLTree0.getBalance(node89);
        java.lang.Class<?> wildcardClass91 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        AVLTree aVLTree8 = new AVLTree();
        AVLTree.Node node10 = aVLTree8.find((int) '4');
        AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        AVLTree.Node node19 = aVLTree0.getRoot();
        int int20 = aVLTree0.height();
        AVLTree aVLTree21 = new AVLTree();
        AVLTree.Node node23 = aVLTree21.find((int) '4');
        AVLTree.Node node24 = aVLTree21.getRoot();
        AVLTree.Node node26 = aVLTree21.find((int) (short) -1);
        AVLTree aVLTree27 = new AVLTree();
        AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        aVLTree27.delete(100);
        AVLTree aVLTree40 = new AVLTree();
        AVLTree.Node node42 = aVLTree40.find((int) '4');
        AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree27.getBalance(node48);
        int int50 = aVLTree21.getBalance(node48);
        int int51 = aVLTree21.height();
        aVLTree21.delete((int) (byte) 0);
        AVLTree aVLTree54 = new AVLTree();
        AVLTree.Node node56 = aVLTree54.find((int) '4');
        AVLTree.Node node57 = null;
        int int58 = aVLTree54.getBalance(node57);
        aVLTree54.insert((int) '4');
        aVLTree54.delete((int) (short) 1);
        AVLTree.Node node63 = aVLTree54.getRoot();
        int int64 = aVLTree21.getBalance(node63);
        int int65 = aVLTree0.getBalance(node63);
        int int66 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        aVLTree0.delete(1);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AVLTree.Node node8 = aVLTree0.find(100);
        AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(1);
        AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 100);
        AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int16 = aVLTree0.height();
        AVLTree.Node node17 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        AVLTree aVLTree6 = new AVLTree();
        AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        AVLTree.Node node30 = aVLTree0.getRoot();
        AVLTree aVLTree31 = new AVLTree();
        AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        aVLTree31.delete(1);
        AVLTree.Node node38 = aVLTree31.getRoot();
        AVLTree.Node node40 = aVLTree31.find((int) (byte) 10);
        AVLTree.Node node41 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        aVLTree31.insert((int) (short) 1);
        AVLTree.Node node46 = aVLTree31.getRoot();
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node49 = aVLTree47.find((int) '4');
        AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        int int53 = aVLTree47.height();
        AVLTree.Node node55 = aVLTree47.find((int) (short) -1);
        AVLTree.Node node56 = aVLTree47.getRoot();
        AVLTree.Node node58 = aVLTree47.find(1);
        AVLTree.Node node59 = aVLTree47.getRoot();
        AVLTree aVLTree60 = new AVLTree();
        AVLTree.Node node62 = aVLTree60.find((-1));
        aVLTree60.delete(100);
        AVLTree aVLTree65 = new AVLTree();
        AVLTree.Node node66 = null;
        int int67 = aVLTree65.getBalance(node66);
        aVLTree65.insert((int) (byte) 100);
        aVLTree65.insert((int) 'a');
        AVLTree.Node node73 = aVLTree65.find((int) (byte) 100);
        int int74 = aVLTree60.getBalance(node73);
        int int75 = aVLTree47.getBalance(node73);
        int int76 = aVLTree31.getBalance(node73);
        int int77 = aVLTree0.getBalance(node73);
        AVLTree aVLTree78 = new AVLTree();
        AVLTree.Node node79 = null;
        int int80 = aVLTree78.getBalance(node79);
        aVLTree78.insert((int) (byte) 100);
        aVLTree78.insert((int) 'a');
        AVLTree.Node node86 = aVLTree78.find((int) (byte) 100);
        AVLTree.Node node87 = aVLTree78.getRoot();
        AVLTree aVLTree88 = new AVLTree();
        AVLTree.Node node89 = null;
        int int90 = aVLTree88.getBalance(node89);
        aVLTree88.insert((int) (byte) 100);
        aVLTree88.insert((int) 'a');
        AVLTree.Node node95 = aVLTree88.getRoot();
        int int96 = aVLTree78.getBalance(node95);
        int int97 = aVLTree0.getBalance(node95);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        AVLTree.Node node18 = aVLTree0.find(0);
        aVLTree0.insert((-1));
        AVLTree.Node node21 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        int int12 = aVLTree0.height();
        aVLTree0.delete(100);
        AVLTree.Node node16 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        AVLTree aVLTree3 = new AVLTree();
        AVLTree.Node node5 = aVLTree3.find((int) '4');
        AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        AVLTree.Node node23 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 100);
        AVLTree.Node node27 = aVLTree0.find(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node7 = aVLTree0.find(1);
        AVLTree.Node node9 = aVLTree0.find(10);
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) (byte) -1);
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        AVLTree.Node node18 = aVLTree10.find((int) '#');
        AVLTree aVLTree19 = new AVLTree();
        AVLTree.Node node21 = aVLTree19.find((int) '4');
        AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        AVLTree aVLTree26 = new AVLTree();
        AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        int int38 = aVLTree0.height();
        aVLTree0.insert(0);
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass43 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        int int8 = aVLTree0.height();
        AVLTree aVLTree9 = new AVLTree();
        AVLTree.Node node11 = aVLTree9.find((int) '4');
        AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        AVLTree aVLTree16 = new AVLTree();
        AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.insert((int) (byte) 100);
        aVLTree16.insert((int) 'a');
        AVLTree.Node node23 = aVLTree16.getRoot();
        int int24 = aVLTree9.getBalance(node23);
        AVLTree.Node node26 = aVLTree9.find((int) (short) 100);
        aVLTree9.delete((int) (short) -1);
        AVLTree.Node node30 = aVLTree9.find(0);
        int int31 = aVLTree0.getBalance(node30);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        AVLTree aVLTree6 = new AVLTree();
        AVLTree.Node node8 = aVLTree6.find((int) '4');
        AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        AVLTree.Node node19 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) '#');
        AVLTree.Node node24 = aVLTree0.getRoot();
        AVLTree.Node node26 = aVLTree0.find((int) (byte) 0);
        AVLTree.Node node28 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(10);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        AVLTree.Node node9 = aVLTree0.find((int) ' ');
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        AVLTree aVLTree17 = new AVLTree();
        AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        AVLTree.Node node28 = aVLTree0.getRoot();
        int int29 = aVLTree0.height();
        AVLTree.Node node30 = aVLTree0.getRoot();
        int int31 = aVLTree0.height();
        AVLTree.Node node32 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete(100);
        AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete(0);
        AVLTree aVLTree10 = new AVLTree();
        AVLTree.Node node12 = aVLTree10.find((int) '4');
        AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert((int) '4');
        AVLTree.Node node18 = aVLTree10.find((int) (short) 0);
        AVLTree.Node node20 = aVLTree10.find((int) ' ');
        aVLTree10.insert((int) (short) 100);
        int int23 = aVLTree10.height();
        AVLTree aVLTree24 = new AVLTree();
        AVLTree.Node node26 = aVLTree24.find((int) '4');
        AVLTree.Node node28 = aVLTree24.find((int) 'a');
        AVLTree.Node node29 = aVLTree24.getRoot();
        AVLTree.Node node30 = aVLTree24.getRoot();
        AVLTree.Node node31 = aVLTree24.getRoot();
        aVLTree24.delete((int) (byte) 10);
        int int34 = aVLTree24.height();
        AVLTree.Node node36 = aVLTree24.find((int) (short) 10);
        AVLTree aVLTree37 = new AVLTree();
        AVLTree.Node node39 = aVLTree37.find((int) '4');
        AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree24.getBalance(node45);
        AVLTree aVLTree47 = new AVLTree();
        AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.insert((int) 'a');
        AVLTree.Node node55 = aVLTree47.find((int) (byte) 100);
        AVLTree aVLTree56 = new AVLTree();
        AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        AVLTree.Node node61 = aVLTree56.getRoot();
        aVLTree56.delete(0);
        AVLTree.Node node64 = null;
        int int65 = aVLTree56.getBalance(node64);
        int int66 = aVLTree56.height();
        AVLTree aVLTree67 = new AVLTree();
        AVLTree.Node node69 = aVLTree67.find((int) '4');
        AVLTree.Node node70 = aVLTree67.getRoot();
        aVLTree67.delete(100);
        aVLTree67.insert((int) (byte) 10);
        AVLTree.Node node75 = aVLTree67.getRoot();
        int int76 = aVLTree56.getBalance(node75);
        int int77 = aVLTree47.getBalance(node75);
        AVLTree.Node node78 = aVLTree47.getRoot();
        int int79 = aVLTree24.getBalance(node78);
        int int80 = aVLTree10.getBalance(node78);
        int int81 = aVLTree0.getBalance(node78);
        AVLTree.Node node83 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNull(node83);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 10);
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node12);
    }
}

