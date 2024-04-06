package divididaPor0;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DividePor0_2 {
    public static void main(String[] args){
       try {
           Scanner s = new Scanner(System.in);
           System.out.println("numero: ");

           int a = s.nextInt();
           System.out.println("divisor: ");

           int b = s.nextInt();
           System.out.println(a / b);
       }
       catch (InputMismatchException e1) {
           System.out.println("erro de input capturado");
       }
       catch (Throwable e2){
           System.out.println("erro de aritimetica encontrado");
       }
//AVALIAÇÃO DE ERRO COM TRY CATCH E InputMismatchException e1
        //ThrowablE
        //estrutura montada sem loop para debug 
    }
}

