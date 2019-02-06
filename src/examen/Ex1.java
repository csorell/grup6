
package examen;
public class Ex1 {
            
    public static int[] erastótenes(int num){
        boolean [] matriu = new boolean[num + 1];
        int numPrimers = 0;
        //false significa que es primer, true significqa que no ho és
        matriu[0] = matriu[1] = true;
        for(int i = 2; i <= num; i++){
            
            if(matriu[i] == false){
                numPrimers++;
                for(int j = i+1; j <= num ; j++){
                    if(matriu[j] == false){
                        if(j%i == 0){
                            matriu[j] = true;                           
                        }
                    }
                }
            }   
        }
        
        //passar l'array de booleans indicatn quins són primers a un array de ints
        int [] primers = new int[numPrimers];
        int tempPrimers = 0;
        for(int i = 2; i < matriu.length; i++){
            if(matriu[i] == false){
                primers[tempPrimers] = i;
                tempPrimers++;
            }
        }
        
        return primers;
    }
}
