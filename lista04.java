package primeiroprojeto;

import java.util.Scanner;

public class lista04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos e é maior de idade");
        } else {
            System.out.println("Você tem " + idade + " anos e é menor de idade");
        }

        // 2 
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior ou eles são iguais");
        }

        // 3 
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        if (nota > 7) {
            System.out.println("Aprovado: sua nota foi " + nota);
        } else {
            System.out.println("Reprovado: sua nota foi " + nota);
        }

        // 4 
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo ou zero");
        }

        // 5 
        System.out.print("Digite a distância de entrega em km: ");
        double distancia = scanner.nextDouble();
        double frete = (distancia <= 50) ? 10.0 : distancia * 0.5;
        System.out.println("Valor do frete: R$ " + frete);

        // 6 
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        if (num == 10) {
            System.out.println("O número é 10");
        } else {
            System.out.println("O número não é 10");
        }

        // 7 
        System.out.print("Você é associado da loja? (sim/não): ");
        String resposta = scanner.next().toLowerCase();
        if (resposta.equals("sim")) {
            System.out.println("Você tem desconto");
        } else {
            System.out.println("Você não tem desconto");
        }

        // 8 
        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horas = scanner.nextInt();
        double bonus = (horas < 10) ? horas * 20.0 : horas * 15.0;
        System.out.println("Bônus por hora extra R$" + bonus);

        scanner.close();
    }
}