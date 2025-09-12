package primeiroprojeto;

import java.util.Scanner;

public class lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 
        System.out.println("\n1 - Contador de 10 a 30:");
        int numero = 10;
        while (numero <= 30) {
            System.out.print(numero + " ");
            numero++;
        }
        System.out.println("\n---------------------");

        // 2
        System.out.println("\n2 - Soma de 3 números:");
        int contador = 1;
        int soma = 0;
        while (contador <= 3) {
            System.out.print("Digite o " + contador + "º número: ");
            int n = sc.nextInt();
            soma += n;
            contador++;
        }
        System.out.println("Soma total = " + soma);
        System.out.println("---------------------");

        // 3
        System.out.println("\n3 - Multiplicação de 5 números:");
        contador = 1;
        int produto = 1;
        while (contador <= 5) {
            System.out.print("Digite o " + contador + "º número: ");
            int n = sc.nextInt();
            produto *= n;
            contador++;
        }
        System.out.println("Resultado da multiplicação = " + produto);
        System.out.println("---------------------");

        // 4 
        System.out.println("\n4 - Contar até N:");
        System.out.print("Digite um número: ");
        int limite = sc.nextInt();
        contador = 1;
        while (contador <= limite) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println("\n---------------------");

        // 5 
        System.out.println("\n5 - Somar números de 1 a 5:");
        contador = 1;
        soma = 0;
        while (contador <= 5) {
            soma += contador;
            contador++;
        }
        System.out.println("Soma = " + soma);
        System.out.println("---------------------");

        // 6 
        System.out.println("\n6 - Tabuada:");
        System.out.print("Digite um número: ");
        int tabuada = sc.nextInt();
        contador = 1;
        while (contador <= 10) {
            System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador));
            contador++;
        }

     
    }
}
