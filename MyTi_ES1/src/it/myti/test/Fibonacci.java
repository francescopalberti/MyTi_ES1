package it.myti.test;
import java.math.*;

/* Fase 1
 * Risolvi il seguente problema con uno script nel linguaggio di programmazione che preferisci.
 * 
 * I primi dodici numeri della sequenza di Fibonacci sono:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 * Il 12° numero è il primo della sequenza a essere di 3 cifre. 
 * Quale è il primo numero della sequenza ad avere 1000 cifre?
 * 
*/

public class Fibonacci 
{  

    public static void main(String[] args) 
    { 
    	BigDecimal[] fib = new BigDecimal[2];
        fib[0] = BigDecimal.valueOf(0);
        fib[1] = BigDecimal.valueOf(1);
        BigDecimal fib_n = BigDecimal.valueOf(0);
        int n = 1; 
        while(true){
        	//uso una array per salvare Fn-1 e Fn-2
            fib_n = fib[0].add(fib[1]);
            fib[0] = fib[1];
            fib[1] = fib_n;
            ++n;
            //controllo che abbia 1000 cifre
            if(fib_n.toString().length() == 1000){
                System.out.println("Il primo numero della sequenza ad avere 1000 cifre: " + n);
                break;
            }
            
        }
}
}