package examen;
public class Ex3 {
    
    public static String esborraDe(String fragment, String stringText){
        char [] text = new char[stringText.length()];
        char [] frag = new char[fragment.length()];
        String textFinal = "";
        
        for(int i = 0; i < stringText.length(); i++){
            text[i] = stringText.charAt(i);
        }
        for(int i = 0; i < fragment.length(); i++){
            frag[i] = fragment.charAt(i);
        }
        
        for(int i = 0; i < text.length; i++){
            int lletra = 0;
            while((lletra < frag.length) && (text[i + lletra] == frag[lletra])){
                lletra++;
            }
            if(lletra == frag.length){
                i = i + frag.length -1; 
            }
            else{
                textFinal = (textFinal + text[i]);
            }
        }
                
        
        return textFinal;
        
    }
    
    public static void main (String[] args){
        System.out.println(Ex3.esborraDe("ne", "penefantasticone"));
    }
}
