package POO;

public class Calculadora {

    private double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    private double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private double dividir(double valor1, double valor2) {

        return valor1 / valor2;
    }

    private double multiplicar(double valor1, double valor2) {

        return valor1 * valor2;
    }

    public double calcular(double v1, double v2, char operacao) {

        switch (operacao) {
            case '+':
                return somar(v1, v2);
            case '-':
                return subtrair(v1, v2);
            case '*':
                return multiplicar(v1, v2);
            case '/':
                return dividir(v1, v2);
            default:
                return 0;

        }

    }
}
