import java.util.Scanner;

public class Lista15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor de frutas
        String[] frutas = new String[5];
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Digite o nome da fruta: ");
            frutas[i] = sc.nextLine();
        }
        System.out.println("Frutas digitadas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("------------------------------------");

        // 2 - Vetor de números inteiros
        int[] inteiros = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            inteiros[i] = sc.nextInt();
        }
        System.out.println("Números digitados:");
        for (int n : inteiros) {
            System.out.println(n);
        }
        System.out.println("------------------------------------");

        // 3 - Mostrando os valores na ordem inversa
        int[] numerosInverso = new int[7];
        for (int i = 0; i < numerosInverso.length; i++) {
            System.out.print("Digite um número: ");
            numerosInverso[i] = sc.nextInt();
        }
        System.out.println("Valores na ordem inversa:");
        for (int i = numerosInverso.length - 1; i >= 0; i--) {
            System.out.println(numerosInverso[i]);
        }
        System.out.println("------------------------------------");

        // 4 - Maiores que 100
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num > 100) {
                System.out.println("maior do que 100");
            }
        }
        System.out.println("------------------------------------");

        // 5 - Procurando um valor no vetor
        int[] vetorBusca = new int[8];
        for (int i = 0; i < vetorBusca.length; i++) {
            System.out.print("Digite um número: ");
            vetorBusca[i] = sc.nextInt();
        }
        System.out.print("Digite um número para procurar: ");
        int busca = sc.nextInt();
        boolean encontrado = false;
        for (int n : vetorBusca) {
            if (n == busca) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }
        System.out.println("------------------------------------");

        sc.nextLine(); // limpar buffer

        // 6 - Nome e idade de 5 pessoas
        String[] nomes = new String[5];
        int[] idades = new int[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // limpar buffer
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " tem " + idades[i] + " anos");
        }
        System.out.println("------------------------------------");

        // 7 - Identificação de idade
        int[] idadeVerificacao = new int[10];
        for (int i = 0; i < idadeVerificacao.length; i++) {
            System.out.print("Digite uma idade: ");
            idadeVerificacao[i] = sc.nextInt();
        }
        for (int idade : idadeVerificacao) {
            if (idade < 18) {
                System.out.println("você é menor de idade");
            }
        }
        System.out.println("------------------------------------");

        // 8 - Aumento em massa
        double[] salarios = new double[7];
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário: ");
            salarios[i] = sc.nextDouble();
        }
        for (double salario : salarios) {
            if (salario <= 2500) {
                System.out.println("você receberá um aumento");
            }
        }

    }
}
