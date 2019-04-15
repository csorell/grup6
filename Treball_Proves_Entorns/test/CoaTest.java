import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CoaTest {
    
    public CoaTest() {
    }

    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        int num = 1345;
        Coa instance = new Coa(2, 8, 10);
        instance.push(num);
        Assert.assertEquals(1345, num);
    }

    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        Coa instance = new Coa(2, 8, 9, 10);
        instance.pop();
        Assert.assertEquals(8, instance.top());
    }
    
    @Test(expected=Exception.class)
    public void testPopEmpty() throws Exception {
        System.out.println("popEmpty");
        Coa instance = new Coa();
        instance.pop();
    }

    @Test
    public void testIsEmptyFalse() {
        System.out.println("isEmptyFalse");
        Coa instance = new Coa(2, 8, 10);
        boolean result = instance.isEmpty();
        Assert.assertEquals(false, result);
    }
    
    @Test
    public void testIsEmptyTrue() {
        System.out.println("isEmptyTrue");
        Coa instance = new Coa();
        boolean result = instance.isEmpty();
        Assert.assertEquals(true, result);
    }

    @Test(expected=Exception.class)
    public void testTopEmpty() throws Exception {
        System.out.println("topEmpty");
        Coa instance = new Coa();
        int result = instance.top();
    }
    
    @Test
    public void testTop() throws Exception {
        System.out.println("top");
        Coa instance = new Coa(1991, 45, 157, 27);
        int result = instance.top();
        Assert.assertEquals(1991, result);
    }
       
}
