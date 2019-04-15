
import java.util.ArrayList;
public class Pila {
    public ArrayList<Integer> pila = new ArrayList<>();
    
    public Pila ( int... numbers ) {
        for (int number: numbers) {
            pila.add(number);
        }
    }
    
    public Pila (){}
    
    public void push(int num){
        pila.add(num);
    }
    
    public void pop() throws Exception{
        if(pila.size() == 0)
            throw new Exception ("L'array ja és buit.");
        pila.remove(pila.size() - 1);
    }
    
    public boolean isEmpty(){
        return pila.size() == 0;
    }
    
    public int top() throws Exception{
        if(pila.size() == 0)
            throw new Exception ("L'array ja és buit.");
        return pila.get(pila.size() - 1);
    }  
}
