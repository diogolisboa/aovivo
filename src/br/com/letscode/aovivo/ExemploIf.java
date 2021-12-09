package br.com.letscode.aovivo;

import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {

        int tamanhoArgs = args.length;
        int numero1;
        int numero2;

        Scanner input = new Scanner(System.in);

        if (tamanhoArgs == 0) {
            System.out.println("Digite o primeiro número");
            numero1 = input.nextInt();
            System.out.println("Digite o segundo número");
            numero2 = input.nextInt();
            System.out.println("A soma dos números é " + (numero1 + numero2));
        }
        else if (tamanhoArgs == 1) {
            numero1 = Integer.parseInt(args[0]);
            System.out.println("Digite o segundo número");
            numero2 = input.nextInt();
            System.out.println("A soma dos números é " + (numero1 + numero2));
        }
        else if (tamanhoArgs == 2) {
            numero1 = Integer.parseInt(args[0]);
            numero2 = Integer.parseInt(args[1]);
            System.out.println("A soma dos números é " + (numero1 + numero2));
        }
        else {
            System.out.println("Número de argumentos inválidos");
        }

    }
}
