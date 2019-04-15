
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PilaTest {
    
    public PilaTest() {
    }

    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        int num = 1345;
        Pila instance = new Pila(2, 8, 10);
        instance.push(num);
        Assert.assertEquals(instance.top(), num);
    }

    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        Pila instance = new Pila(2, 8, 10);
        instance.pop();
        Assert.assertEquals(8, instance.top());
    }
    
    @Test(expected=Exception.class)
    public void testPopEmpty() throws Exception {
        System.out.println("popEmpty");
        Pila instance = new Pila();
        instance.pop();
    }

    @Test
    public void testIsEmptyFalse() {
        System.out.println("isEmptyFalse");
        Pila instance = new Pila(2, 8, 10);
        boolean result = instance.isEmpty();
        Assert.assertEquals(false, result);
    }
    
    @Test
    public void testIsEmptyTrue() {
        System.out.println("isEmptyTrue");
        Pila instance = new Pila();
        boolean result = instance.isEmpty();
        Assert.assertEquals(true, result);
    }

    @Test(expected=Exception.class)
    public void testTopEmpty() throws Exception {
        System.out.println("topEmpty");
        Pila instance = new Pila();
        int result = instance.top();
    }
    
    @Test
    public void testTop() throws Exception {
        System.out.println("top");
        Pila instance = new Pila(1,4);
        int result = instance.top();
        Assert.assertEquals(4, result);
    }
       
}
