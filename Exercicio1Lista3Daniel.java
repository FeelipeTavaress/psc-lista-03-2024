
package exercicio1lista3daniel;

import java.util.Scanner;

public class Exercicio1Lista3Daniel {

    public static void main(String[] args) {
        double num1;
    double num2;
    double num3;
    double media;
    Scanner sc = new Scanner(System.in);
    System.out.println("Escreva um número: ");
     num1 = sc.nextDouble();
    System.out.println("Escreva outro número: ");
     num2 = sc.nextDouble();
    System.out.println("Escreva mais um número: ");
     num3 = sc.nextDouble();
     if(num1 > num2 && num1> num3){
     System.out.println("O maior número é: " + num1);
     
    } else if(num2 > num1 && num2 > num3){
        System.out.println("O maior número é: " + num2);
    } else {
            System.out.println("O maior número é: " + num3);
            if(num1 < num2 && num1 < num3){
     System.out.println("O menor número é: " + num1);
     
    } else if(num2 < num1 && num2 < num3){
        System.out.println("O menor número é: " + num2);
    } else {
            System.out.println("O menor número é: " + num3);
     
     }
            media = (num1 + num2 + num3)/3;
     System.out.println("E a média estre os números é: "+ media);
    
    }
    }
}
