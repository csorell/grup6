
import java.util.ArrayList;


public class Coa {
    private ArrayList<Integer> pila = new ArrayList<>();
    
    public Coa ( int... numbers ) {
        for (int number: numbers) {
            pila.add(number);
        }
    }
    
    public Coa (){}
    
    public void push(int num){
        pila.add(num);
    }
    
    public void pop() throws Exception{
        if(pila.size() == 0)
            throw new Exception ("L'array ja és buit.");
        pila.remove(0);
    }
    
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    
    public int top() throws Exception{
        if(pila.size() == 0)
            throw new Exception ("L'array ja és buit.");
        return pila.get(0);
    }
    
    
}

