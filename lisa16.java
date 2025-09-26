package primeiroprojeto;

import java.util.Scanner;

public class lisa16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor de cores
        String[] cores = new String[6];
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Digite uma cor: ");
            cores[i] = sc.nextLine();
        }
        System.out.println("Cores digitadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        System.out.println("------------------------------------------------");

        // 2 - Vetor de números decimais
        double[] numeros = new double[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número decimal: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Números decimais digitados:");
        for (double n : numeros) {
            System.out.println(n);
        }
        System.out.println("------------------------------------------------");

        // 3 - Mostrando apenas os pares
        int[] inteiros = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            inteiros[i] = sc.nextInt();
        }
        System.out.println("Números pares digitados:");
        for (int n : inteiros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
        System.out.println("------------------------------------------------");

        // 4 - Menores que 50
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num < 50) {
                System.out.println("menor que 50");
            }
        }
        System.out.println("------------------------------------------------");

        sc.nextLine(); // limpar buffer

        // 5 - Procurando um nome no vetor
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }
        System.out.print("Digite um nome para procurar: ");
        String busca = sc.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }
        System.out.println("------------------------------------------------");

        // 6 - Produto e preço
        String[] produtos = new String[4];
        double[] precos = new double[4];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto: ");
            produtos[i] = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            precos[i] = sc.nextDouble();
            sc.nextLine(); // limpar buffer
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }
        System.out.println("------------------------------------------------");

        // 7 - Verificação de notas
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = sc.nextDouble();
        }
        for (double nota : notas) {
            if (nota < 6) {
                System.out.println("aluno reprovado");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("aluno em recuperação");
            } else {
                System.out.println("aluno aprovado");
            }
        }
        System.out.println("------------------------------------------------");

        // 8 - Promoção de ingressos
        double[] ingressos = new double[5];
        for (int i = 0; i < ingressos.length; i++) {
            System.out.print("Digite o preço do ingresso: ");
            ingressos[i] = sc.nextDouble();
        }
        for (double ingresso : ingressos) {
            if (ingresso > 100) {
                System.out.println("Ingresso com promoção disponível!");
            }
        }


    }
}
