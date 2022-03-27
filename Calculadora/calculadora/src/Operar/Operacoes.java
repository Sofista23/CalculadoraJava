package Operar;
import java.util.Scanner;
public class Operacoes {
    public static void operacoes(int x, int y) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Operações [0] adição, [1] subtração, [2] multiplicação e [3] divisão");
        System.out.print("Escolha uma operação: ");
        int operacao = Integer.parseInt(teclado.nextLine());
        if (operacao == 0) {
            System.out.println("A soma entre "+x+" e "+y+" é "+adicao(x, y));
        } else if (operacao == 1) {
            System.out.println("A diferença entre "+x+" e "+y+" é "+subtracao(x, y));
        } else if (operacao == 2) {
            System.out.println("O produto entre "+x+" e "+y+" é "+multiplicacao(x, y));
        } else if (operacao == 3) {
            if (y == 0) {
                System.out.println("Não é possível dividir um número por 0.");
            } else {
                System.out.println("A divisão entre "+x+" e "+y+" é "+divisao(x, y));
            }
        }
    }

    private static int adicao(int a, int b) {
        return a+b; 
    }
    private static int subtracao(int a, int b) {
        return a-b;
    }
    private static int multiplicacao(int a, int b) {
        return a*b;
    }
    private static int divisao(int a, int b) {
        return a/b;
    }
}
