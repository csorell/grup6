package examen;
public class Ex2 {
    
    public static String factorial(int num){
        int resultat = num;
        int[] primers = Ex1.erastótenes(num/2+1);
        int posPrimers = 0;
        String fact = "";
        while(resultat != 1){
            if(resultat % primers[posPrimers] == 0){
                fact = (fact + primers[posPrimers] + "  ");
                resultat = resultat/primers[posPrimers];
            }
            else{
                posPrimers++;
            }
        }
        return fact;
    }
}
