package br.com.letscode.aovivo;


import java.time.DayOfWeek;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        double numero1;
        double numero2;
        double resultado = 0;
        String operacao;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        numero1 = input.nextDouble();

        System.out.println("Digite o segundo número ");
        numero2 = input.nextDouble();

        System.out.printf("Digite a operação matemática");

        operacao = input.next();

        switch (operacao){

            case "+":
                resultado = numero1 + numero2;
                break;

            case "-":
                resultado = numero1 - numero2;
                break;

            case "/":
                resultado = numero1 / numero2;
                break;

            case "*":
                resultado = numero1 * numero2;
                break;
        }

        System.out.printf("%f %s %f = %f", numero1, operacao, numero2, resultado);

        input.close();

    }
}
