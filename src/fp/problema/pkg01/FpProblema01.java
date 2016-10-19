
package fp.problema.pkg01;
import java.util.*;

public class FpProblema01 {
/**
  Problemas.
1. Escribir un programa que determine si un año es bisiesto. Una año es bisiesto si el múltiplo de 4.
* (Ej. 1984. Los años múltiplos de 100 no son bisiestos, salvo si ellos son también múltiplos de 400 
* (2000 es bisiesto, 1800 no lo es).
**/
    public static void main(String[] args) {
     int a;
     Scanner entradaDato= new Scanner(System.in);
        System.out.println("Introduce un año");
        a= entradaDato.nextInt();
        if((a%4== 0) && (a%100 !=0) || (a%400==0)){
            System.out.println("El año SI es bisiesto");
        }else{
            System.out.println("El año NO es bisiesto");
        }
    }
    
}
