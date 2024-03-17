
package exercicio5lista3daniel;

import java.util.Scanner;


public class Exercicio5Lista3Daniel {

    public static void main(String[] args) {
        float num1;
        float num2;
        String operador = " ";
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        num1 = sc.nextFloat();
        
        System.out.println("Escreva mais um número: ");
        num2 = sc.nextFloat();
        sc.nextLine();
        
        System.out.println("Escreva o símbolo da operação(+,-,*,/, ^) : ");
        operador = sc.nextLine();
        
       

        switch (operador){
            case "+":
            System.out.printf(" a soma é: "+ (num1 + num2));
            break;

            case "-":
                System.out.printf("a subtração é: " + (num1 - num2));
                    break;
                    
            case "*":
                System.out.printf("a multiplicação é: " + num1 * num2);
                break;
                
                 case "/":
                System.out.printf("a divisão é: " + num1 / num2);
                break;
                
                case "^":
                System.out.printf("a exponenciação é:  " + Math.pow(num1,num2));
                break;
                
                 default:
                System.out.println("O simbolo da operação é invalido! ");
                break;
                
            
               }
        
        sc.close();
    }
    
     
}
