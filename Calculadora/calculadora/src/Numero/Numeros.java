package Numero;
import java.util.Scanner;
public class Numeros {
    public static int numero1() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escolha o Primeiro número: ");
        return Integer.parseInt(teclado.nextLine());
    }

    public static int numero2() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escolha o Segundo número: ");
        return Integer.parseInt(teclado.nextLine());
    }
}
