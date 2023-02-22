package POO;

import POO.Calculadora;

import java.util.Scanner;

public class ProjetoCalculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculadora casio = new Calculadora();

        double v1, v2;
        char operacao;

        System.out.println("Digite o primeiro valor: ");
        v1 = input.nextDouble();
        System.out.println("Digite a operação desejada: ");
        operacao = input.next().charAt(0);
        System.out.println("Digite o segundo valor: ");
        v2 = input.nextDouble();

        double resultado = casio.calcular(v1, v2, operacao);
        System.out.println("O resultado da operação é: " + resultado);
    }
}
