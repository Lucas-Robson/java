package primeiroprojeto;

import java.util.Scanner;

public class lista13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// 1 
			int num = 10;
			do {
			    System.out.println(num);
			    num++;
			} while (num <= 30);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 2 
			int i = 1;
			do {
			    System.out.print("Digite a idade " + i + ": ");
			    int idade = scanner.nextInt();
			    if (idade >= 18) {
			        System.out.println("Maior de idade");
			    } else {
			        System.out.println("Menor de idade");
			    }
			    i++;
			} while (i <= 10);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 3 
			int voto, v = 1;
			do {
			    System.out.print("Digite o voto " + v + ": ");
			    voto = scanner.nextInt();
			    switch (voto) {
			        case 1: System.out.println("Candidato 1"); break;
			        case 2: System.out.println("Candidato 2"); break;
			        case 3: System.out.println("Candidato 3"); break;
			        case 4: System.out.println("Candidato 4"); break;
			        case 5: System.out.println("Voto Nulo"); break;
			        case 6: System.out.println("Voto em Branco"); break;
			        default: System.out.println("Voto Inválido");
			    }
			    v++;
			} while (v <= 5);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 4 
			scanner.nextLine(); 
			System.out.print("Digite uma frase: ");
			String frase = scanner.nextLine();
			System.out.print("Digite o número de repetições: ");
			int repeticoes = scanner.nextInt();
			int rep = 1;
			do {
			    System.out.println(frase);
			    rep++;
			} while (rep <= repeticoes);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 5 
			int seq = 50;
			do {
			    System.out.println(seq);
			    seq--;
			} while (seq >= 30);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 6 
			int alt = 1;
			do {
			    System.out.println(alt);
			    alt += 2;
			} while (alt <= 50);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 7 
			int n = 1;
			do {
			    System.out.print("Digite a nota " + n + ": ");
			    double nota = scanner.nextDouble();
			    if (nota >= 6) {
			        System.out.println("Aprovado");
			    } else {
			        System.out.println("Reprovado");
			    }
			    n++;
			} while (n <= 5);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 8 
			int p = 1;
			do {
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
			    p++;
			} while (p <= 5);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

			// 9 
			int cont = 1;
			do {
			    System.out.print("Digite o número " + cont + ": ");
			    int numTeste = scanner.nextInt();
			    if (numTeste > 0) {
			        System.out.println("Positivo");
			    } else if (numTeste < 0) {
			        System.out.println("Negativo");
			    } else {
			        System.out.println("Zero");
			    }
			    cont++;
			} while (cont <= 7);
		}

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");

       
    }
}
