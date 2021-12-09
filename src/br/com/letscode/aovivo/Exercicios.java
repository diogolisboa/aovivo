package br.com.letscode.aovivo;

public class Exercicios {

    public static void main(String[] args) {
        final double fator1 = 9.0/5;
        final double fator2 = 32;
        double celsius = 37;

        double farheint = (celsius * fator1) + fator2;

        System.out.println(String.format("%f Celsius é igual a %f Fahrenheit", celsius, farheint));
    }
}
