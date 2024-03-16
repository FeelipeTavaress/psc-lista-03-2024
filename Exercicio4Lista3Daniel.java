
package exercicio4lista3daniel;

import java.util.Scanner;


public class Exercicio4Lista3Daniel {


    public static void main(String[] args) {
    double operacao;
    double r;
    double perimetro;
    double area;
    double volume;

   Scanner sc = new Scanner(System.in);
    System.out.println("Escreva o indicador de operação(1: périmetro, 2: área, 3: volume) : ");
     operacao = sc.nextDouble();

    if ( operacao == 1) {  
         System.out.println("Escreva o raio do círculo ou esfera: ");
         r = sc.nextDouble();
        perimetro = ( 2 * 3.141592 * r) ;
               System.out.println ("O perímetro do circulo é: " + perimetro);
               
    } else if (operacao == 2) {
        System.out.println("Escreva o raio do círculo ou esfera: ");
         r = sc.nextDouble();
        area = ( 3.141592 * (r * r));
         System.out.println("A área do círculo é: " + area);
        
    } else if (operacao == 3) {
        System.out.println("Escreva o raio do círculo ou esfera: ");
     r = sc.nextDouble();
     volume = (((4/3)* 3.141592 )* r * r * r);
    System.out.println ("O volume da esfera é: " + volume);        
               
    } else {
                System.out.println("O código da operação é inválido!");
            }
    sc.close();
    }
    
}
