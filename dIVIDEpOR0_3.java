package divididaPor0;
import java.util.InputMismatchException;
import java.util.Scanner;


public class dIVIDEpOR0_3 {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       boolean Continua = false;

       do {


           try {
               System.out.println("numero: ");

               int a = s.nextInt();
               System.out.println("divisor: ");

               int b = s.nextInt();
               System.out.println(a / b);
           } catch (InputMismatchException e1) {
               System.err.println("favor inserir numero inteiros");
           } catch (Throwable e2) {
               System.err.println("o divisor deve ser diferente de 0");
           } finally {
               System.err.println("finally executado.....");
           }
       }while(Continua);
    }
    //testes com try catch e finnaly
   // estrutura de testes pronta com loop de repetição para casos como inserção de dados incorretos ou invalidos
}

