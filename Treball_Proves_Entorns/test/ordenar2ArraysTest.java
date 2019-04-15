import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ordenar2ArraysTest {

    @Test (expected=Exception.class)
    public void testSumOrdCB1() throws Exception {
        System.out.println("testSumOrdCB1");
        int[] llista1 = {};
        int[] llista2 = {4,5,6};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdCB2() throws Exception {
        System.out.println("testSumOrdCB2");
        int[] llista1 = {5,7,13,34,45,48,89};
        int[] llista2 = {4,5,6};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdCB3() throws Exception {
        System.out.println("testSumOrdCB3");
        int[] llista1 = {5,1,-7};
        int[] llista2 = {4,5,6};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdCB4() throws Exception {
        System.out.println("testSumOrdCB4");
        int[] llista1 = {4,5,6};
        int[] llista2 = {5,1,-7};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test
    public void testSumOrdCB5() throws Exception {
        System.out.println("testSumOrdCB5");
        int[] llista1 = {-7,8,16};
        int[] llista2 = {-6,10,15};
        int[] expResult = {-7,-6,8,10,15,16};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdCB6() throws Exception {
        System.out.println("testSumOrdCB6");
        int[] llista1 = {-7};
        int[] llista2 = {-6,10,15};
        int[] expResult = {-7,-6,10,15};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdCB7() throws Exception {
        System.out.println("testSumOrdCB7");
        int[] llista1 = {5,10};
        int[] llista2 = {4,6};
        int[] expResult = {4,5,6,10};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdCB8() throws Exception {
        System.out.println("testSumOrdCB8");
        int[] llista1 = {5,10};
        int[] llista2 = {4};
        int[] expResult = {4,5,10};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    
    @Test
    public void testSumOrdEquiv1() throws Exception {
        System.out.println("testSumOrdEquiv1");
        int[] llista1 = {1,2,3};
        int[] llista2 = {4,5,6};
        int[] expResult = {1,2,3,4,5,6};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdEquiv2() throws Exception {
        System.out.println("testSumOrdEquiv2");
        int[] llista1 = {4,5,6};
        int[] llista2 = {1,2,3};
        int[] expResult = {1,2,3,4,5,6};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdEquiv3() throws Exception {
        System.out.println("testSumOrdEquiv3");
        int[] llista1 = {1,12,43};
        int[] llista2 = {1,5,36};
        int[] expResult = {1,1,5,12,36,43};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdErrT1() throws Exception {
        System.out.println("No introduir cap valor en una llista.");
        int[] llista1 = {};
        int[] llista2 = {1,5,36};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdErrT2() throws Exception {
        System.out.println("No introduir cap valor en cap de les dues llistes.");
        int[] llista1 = {};
        int[] llista2 = {};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test
    public void testSumOrdErrT3() throws Exception {
        System.out.println("Que les dues llistes siguin de diferent longitud.");
        int[] llista1 = {1,7,37,46};
        int[] llista2 = {1,5,36};
        int[] expResult = {1,1,5,7,36,37,46};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSumOrdErrT4() throws Exception {
        System.out.println("Introduir un valor negatiu.");
        int[] llista1 = {-79,-1,68};
        int[] llista2 = {-4,1,5,36};
        int[] expResult = {-79,-4,-1,1,5,36,68};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdErrT5() throws Exception {
        System.out.println("Introduir valors desordenats dins una llista.");
        int[] llista1 = {78,1,34,37};
        int[] llista2 = {1,-78,36};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
    @Test (expected=Exception.class)
    public void testSumOrdErrT6() throws Exception {
        System.out.println("Introduir més valors que el número màxim de valors en una mateixa llista.");
        int[] llista1 = {78,1,34,37,46,78};
        int[] llista2 = {1,-78,36};
        int[] result = ordenar2Arrays.sumaYordena(llista1, llista2);
    }
    
}
