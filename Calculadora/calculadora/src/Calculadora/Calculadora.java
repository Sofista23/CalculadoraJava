package Calculadora;
import Menu.Nome;
import Numero.Numeros;
import Operar.Operacoes;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Nome nome = new Nome();
        Numeros numeros = new Numeros();
        Operacoes opr = new Operacoes();
        
        nome.nome();
        opr.operacoes(numeros.numero1(), numeros.numero2());
    }
}