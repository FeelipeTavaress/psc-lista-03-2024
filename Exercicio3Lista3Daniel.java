
package programacauculoderaizesequacao2grau;

import java.util.Scanner;


public class Exercicio3Lista3Daniel {
       public static void main(String[] args) {
    double A ;
    double B;
    double C;
    double delta;
    double raiz1;
    double raiz2;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor para A: ");
     A = sc.nextDouble();
     System.out.println("Informe um valor para B: ");
     B = sc.nextDouble();
     System.out.println("Informe um valor para C: ");
     C = sc.nextDouble();
    delta =((B * B)- 4* A *C);
    raiz1 = ((-B - Math.sqrt(delta))/ 2* A);
    raiz2 = ((-B + Math.sqrt(delta))/ 2* A);
    
      
    
    if (A == 0 && B==0 && C != 0) {            
               System.out.println ("Coeficientes informados incorretamente");
               
    } else if (raiz1 == 0 && raiz2 == 0 ) {
         System.out.println("Esta equação possui duas raizes reais iguais" + raiz1  +  raiz2);
        
                }else if (delta > 0.0) {
    System.out.println ("Esta equação possui duas raízes reais diferentes: " + raiz1 +  raiz2);

        
    } else if (delta == 0.0) {
                raiz1 = -B / (2.0 * A);
                System.out.println("Essa é uma equação de primeiro grau: " + raiz1);
                
               
    } else {
                System.out.println("não há raizes reais para essas equação! ");
            }
    sc.close();
}
}
