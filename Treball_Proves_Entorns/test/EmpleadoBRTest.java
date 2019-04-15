import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class EmpleadoBRTest {

    @Test
    public void testSalBrutoCB1() throws Exception {
        System.out.println("testSalBrutoCB1");
        TipoEmpleado tipo = TipoEmpleado.encargado;
        float ventasMes = 900.0F;
        float horasExtra = 0.0F;
        float expResult = 1500.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoCB2() throws Exception {
        System.out.println("testSalBrutoCB2");
        TipoEmpleado tipo = TipoEmpleado.encargado;
        float ventasMes = 1875.0F;
        float horasExtra = 0.0F;
        float expResult = 1700.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoCB3() throws Exception {
        System.out.println("testSalBrutoCB3");
        TipoEmpleado tipo = TipoEmpleado.encargado;
        float ventasMes = 1333.0F;
        float horasExtra = 0.0F;
        float expResult = 1600.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoCB4() throws Exception {
        System.out.println("testSalBrutoCB4");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 900.0F;
        float horasExtra = 0.0F;
        float expResult = 1000.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoCB5() throws Exception {
        System.out.println("testSalBrutoCB5");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1875.0F;
        float horasExtra = 0.0F;
        float expResult = 1200.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoCB6() throws Exception {
        System.out.println("testSalBrutoCB6");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1333.0F;
        float horasExtra = 0.0F;
        float expResult = 1100.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected=BRException.class)
    public void testSalBrutoCB7() throws Exception {
        System.out.println("testSalBrutoCB7");
        TipoEmpleado tipo = null;
        float ventasMes = -1.0F;
        float horasExtra = -1.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);

    }
   
    @Test
    public void testSalNetoCB1() throws Exception {
        System.out.println("testSalNetoCB1");
        float salarioBruto = 1900.0F;
        float expResult = 1558.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoCB2() throws Exception {
        System.out.println("testSalNetoCB2");
        float salarioBruto = 1333.0F;
        float expResult = 1119.72F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoCB3() throws Exception {
        System.out.println("testSalNetoCB3");
        float salarioBruto = 900.0F;
        float expResult = 900.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected=BRException.class)
    public void testSalNetoCB4() throws Exception {
        System.out.println("testSalNetoCB4");
        float salarioBruto = -1.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);

    }
    
    @Test
    public void testSalBrutoEquiv1() throws Exception {
        System.out.println("testSalBrutoEquiv1");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1.0F;
        float horasExtra = 0.0F;
        float expResult = 1000.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoVL1() throws Exception {
        System.out.println("testSalBrutoVL1");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 0.0F;
        float horasExtra = 0.0F;
        float expResult = 1000.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoVL2() throws Exception {
        System.out.println("testSalBrutoVL2");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 999.99F;
        float horasExtra = 0.0F;
        float expResult = 1000.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoVL3() throws Exception {
        System.out.println("testSalBrutoVL3");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1000.0F;
        float horasExtra = 0.0F;
        float expResult = 1100.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoVL4() throws Exception {
        System.out.println("testSalBrutoVL4");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1499.99F;
        float horasExtra = 0.0F;
        float expResult = 1100.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoV5() throws Exception {
        System.out.println("testSalBrutoVL5");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 1500.0F;
        float horasExtra = 0.0F;
        float expResult = 1200.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalBrutoVLZero() throws Exception {
        System.out.println("testSalBrutoVLZero");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 50.0F;
        float horasExtra = 0.0F;
        float expResult = 1000.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected=BRException.class)
    public void testSalBrutoETNegatiu1() throws Exception {
        System.out.println("testSalBrutoETNegatiu1");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = -1.0F;
        float horasExtra = 1.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);

    }
    
    @Test (expected=BRException.class)
    public void testSalBrutoETNegatiu2() throws Exception {
        System.out.println("testSalBrutoETNegatiu2");
        TipoEmpleado tipo = TipoEmpleado.vendedor;
        float ventasMes = 50.0F;
        float horasExtra = -1.0F;
        float result = EmpleadoBR.calculaSalarioBruto(tipo, ventasMes, horasExtra);

    }

    @Test
    public void testSalNetoVL1() throws Exception {
        System.out.println("testSalNetoVL1");
        float salarioBruto = 0.0F;
        float expResult = 0.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoVL2() throws Exception {
        System.out.println("testSalNetoVL2");
        float salarioBruto = 999.99F;
        float expResult = 999.99F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoVL3() throws Exception {
        System.out.println("testSalNetoVL3");
        float salarioBruto = 1000.0F;
        float expResult = 840.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoVL4() throws Exception {
        System.out.println("testSalNetoVL4");
        float salarioBruto = 1499.99F;
        float expResult = 1259.9916F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalNetoVL5() throws Exception {
        System.out.println("testSalNetoVL5");
        float salarioBruto = 1500.0F;
        float expResult = 1230.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test (expected=BRException.class)
    public void testSalNetoETNegatiu1() throws Exception {
        System.out.println("testSalNetoETNegatiu1");
        float salarioBruto = -1.0F;
        float result = EmpleadoBR.calculaSalarioNeto(salarioBruto);

    }
}
