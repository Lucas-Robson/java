package primeiroprojeto;

import java.util.Scanner;

public class lista14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        System.out.println("Exercício 1 - Contador de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //2
        System.out.println("Exercício 2 - Soma de 1 a 100:");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Resultado da soma: " + soma);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //3
        System.out.println("Exercício 3 - Números pares de 1 a 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //4
        System.out.println("Exercício 4 - Tabuada:");
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //5
        System.out.println("Exercício 5 - Contar números divisíveis por 3 (1 a 50):");
        int contDiv3 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                contDiv3++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + contDiv3);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //6
        System.out.println("Exercício 6 - Números ímpares até N:");
        System.out.print("Digite um número inteiro N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //7
        System.out.println("Exercício 7 - Multiplicação de 5 valores:");
        int multiplicacao = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = sc.nextInt();
            multiplicacao *= valor;
        }
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        //8
        System.out.println("Exercício 8 - Premiação:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe os anos de empresa do funcionário " + i + ": ");
            int anos = sc.nextInt();
            if (anos > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

        sc.close();
    }
}
