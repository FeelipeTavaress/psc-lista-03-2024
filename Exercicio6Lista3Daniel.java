
package exercicio6lista3Daniel;

import java.util.Random;
import java.util.Scanner;


public class Exercicio6Lista3Daniel {


    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Informe um número: ");
        num1 = sc.nextInt();
        System.out.println("Informe outro número: ");
        num2 = sc.nextInt();
        
        
        int minimo = Math.min(num1, num2); 
        int maximo = Math.max(num1, num2);
        
         int sorteado = sorteio.nextInt(maximo - minimo + 1) + minimo;

        if (sorteado % 2 == 0){
            System.out.printf("O numero sorteado é um numero par: " + sorteado);
        }else {
            System.out.printf("O numero sortteado é um numero impar:"+ sorteado);

                     
        sc.close();
    }
    }
}
