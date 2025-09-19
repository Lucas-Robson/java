package primeiroprojeto;

import java.util.Scanner;

public class lista13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            //1 
            for (int num = 10; num <= 30; num++) {
                System.out.println(num);
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //2 
            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a idade " + i + ": ");
                int idade = scanner.nextInt();
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //3
            for (int v = 1; v <= 5; v++) {
                System.out.print("Digite o voto " + v + ": ");
                int voto = scanner.nextInt();
                switch (voto) {
                    case 1: System.out.println("Candidato 1"); break;
                    case 2: System.out.println("Candidato 2"); break;
                    case 3: System.out.println("Candidato 3"); break;
                    case 4: System.out.println("Candidato 4"); break;
                    case 5: System.out.println("Voto Nulo"); break;
                    case 6: System.out.println("Voto em Branco"); break;
                    default: System.out.println("Voto Inválido");
                }
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //4 
            scanner.nextLine(); 
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();
            System.out.print("Digite o número de repetições: ");
            int repeticoes = scanner.nextInt();
            for (int rep = 1; rep <= repeticoes; rep++) {
                System.out.println(frase);
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //5 
            for (int seq = 50; seq >= 30; seq--) {
                System.out.println(seq);
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //6 
            for (int alt = 1; alt <= 50; alt += 2) {
                System.out.println(alt);
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //7
            for (int n = 1; n <= 5; n++) {
                System.out.print("Digite a nota " + n + ": ");
                double nota = scanner.nextDouble();
                if (nota >= 6) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //8 
            for (int p = 1; p <= 5; p++) {
                System.out.print("Digite a idade da pessoa " + p + ": ");
                int idadeCat = scanner.nextInt();
                if (idadeCat <= 12) {
                    System.out.println("Criança");
                } else if (idadeCat <= 17) {
                    System.out.println("Adolescente");
                } else if (idadeCat <= 59) {
                    System.out.println("Adulto");
                } else {
                    System.out.println("Idoso");
                }
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

            //9 
            for (int cont = 1; cont <= 7; cont++) {
                System.out.print("Digite o número " + cont + ": ");
                int numTeste = scanner.nextInt();
                if (numTeste > 0) {
                    System.out.println("Positivo");
                } else if (numTeste < 0) {
                    System.out.println("Negativo");
                } else {
                    System.out.println("Zero");
                }
            }
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        }
    }
}
