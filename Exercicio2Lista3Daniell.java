
package testeexercicio2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio2Lista3Daniel {

    public static void main(String[] args) {
         double conta, pago;
Scanner sc = new Scanner(System.in);
    try {
      System.out.printf("Escreva o Valor da compra: ");
      conta = sc.nextDouble();

      System.out.printf("Escreva o valor pago: ");
      pago = sc.nextDouble();

      System.out.printf("%s", calculaTroco(conta, pago));
    }
    catch (InputMismatchException e) {
      System.err.printf("\nErro: dados informados inválidos !!!\n");
    }
  }
 
  public static String calculaTroco(double conta, double pago) {
    DecimalFormat formatador = new DecimalFormat("###,##0.00");
    if (pago < conta)
       return("\nPagamento insuficiente, faltam R$"+
         formatador.format(conta - pago) +"\n");
   else {
      int nota[] = {100, 50, 20, 10, 5, 2, 1};

      String result;
      double troco;
      int i, vlr, ct;

      troco = pago - conta;
      result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";


      vlr = (int)troco;
      i = 0;
      while (vlr != 0) {
        ct = vlr / nota[i]; 
        if (ct != 0) {
           result = result + (ct + " nota(s) de R$"+ nota[i] +"\n");
           vlr = vlr % nota[i]; 
        }
        i = i + 1;
      }

      result = result +"\n";

      return(result);
    }
  }

}
    
    
