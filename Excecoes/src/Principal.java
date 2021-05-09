import java.util.InputMismatchException;
import java.util.Scanner;
 // @author mbilo

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Divisao d = new Divisao();
        Scanner ler = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.print("Insira o numerador da divisão: ");
                double numerador = ler.nextInt();

                System.out.print("Insira o denominador da divisão: ");
                double denominador = ler.nextInt();
                d.calcula(numerador, denominador);
                continua = false;

            } catch (InputMismatchException erro1) {
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                ler.nextLine(); //descarta a entrada errada do usuário
            } catch (ArithmeticException erro2) {
                System.err.println("O número do divisor deve ser diferente de 0!");
            } finally {
                System.out.println("Execução do Finally!");
            }
        } while (continua);
    }
}