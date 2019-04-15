public class ordenar2Arrays {
    
    public static int [] sumaYordena(int [] llista1, int [] llista2) throws Exception{
        
        // Comprova que cap dels arrays es buit.
        if (llista1.length == 0 || llista2.length == 0 )
            throw new Exception("Un dels arrays o ambdos están buits.");                   
                    
        // Comprova que cap de les llistes supera la llargaria màxima establerta.
        final int MAX = 5;
        if (llista1.length > MAX || llista2.length > MAX ) {
            throw new Exception("Una de les llistes sobrepassa la llargaria maxima.");
        }
        
        // Comprova que ambdues llistes són de la mateixa llargaria. 
        /*if (llista1.length != llista2.length ) {
            throw new Exception("Les dues llistes no són de la mateixa llargaria.");
        }*/
        
        // Comprovar si ambdos arrays están ordenats.
        for(int i = 0; i < llista1.length -1; i++){
            if(llista1[i] > llista1[i+1]){
                throw new Exception ("El primer Array no está ordenat.");
            }
        }
        for(int i = 0; i < llista2.length -1; i++){
            if(llista2[i] > llista2[i+1]){
                throw new Exception ("El segón Array no está ordenat.");
            }
        }
        
        
        int [] sumaOrdenada = new int[llista1.length + llista2.length];
        
        int cont1 = 0;
        int cont2 = 0;
        boolean finLlista2 = false;
        boolean finLlista1 = false;
        for (int i = 0; i < sumaOrdenada.length; i++){
            if ((llista1[cont1] <= llista2[cont2] && !finLlista1) || finLlista2){
                sumaOrdenada[i] = llista1[cont1];
                if (cont1 == llista1.length - 1)
                    finLlista1 = true;
                else
                    cont1++;
            }else{
                sumaOrdenada[i] = llista2[cont2];
                finLlista2 = !(cont2 < llista2.length - 1);
                if (!finLlista2){
                    cont2++;
                }
            }
        }
        return sumaOrdenada;
    }
    
    public static void main(String[] args) throws Exception {
        int[] llista1 = {-79,-1,68};
        int[] llista2 = {-4,1,5,36};
        int [] llistaOrdenada = sumaYordena(llista1, llista2);
        
        for (int i = 0; i < llistaOrdenada.length; i++){
            System.out.print(llistaOrdenada[i] + ",");
        }
        
    }
    
}
