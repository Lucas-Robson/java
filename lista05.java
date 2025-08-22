package primeiroprojeto;

import java.util.Scanner;

public class lista05 extends condicionalif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 1 
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 17) {
            System.out.println("Adolescente");
        } else if (idade < 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        // 2 
        System.out.print("\nDigite a temperatura em °C: ");
        double temp = sc.nextDouble();
        if (temp < 10) {
            System.out.println("Muito Frio");
        } else if (temp < 20) {
            System.out.println("Frio");
        } else if (temp < 30) {
            System.out.println("Agradável");
        } else {
            System.out.println("Muito Quente");
        }

        // 3 
        System.out.print("\nDigite a nota: ");
        double nota = sc.nextDouble();
        if (nota > 90) {
            System.out.println("A");
        } else if (nota > 80) {
            System.out.println("B");
        } else if (nota > 70) {
            System.out.println("C");
        } else if (nota > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.nextLine();

        // 4
        System.out.print("\nDigite a senha: ");
        String senha = sc.nextLine();
        if (senha.equals("admin")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        // 5 
        System.out.print("\nDigite o primeiro nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite o segundo nome: ");
       String nome2 = sc.nextLine();
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais.");
       } else {
            System.out.println("Os nomes são diferentes.");
        }
        
        // 6 
        System.out.print("\nDigite sua cor favorita: ");
        String cor = sc.nextLine().toLowerCase();
        if (cor.equals("azul")) {
            System.out.println("Boa escolha!");
        } else if (cor.equals("vermelho")) {
            System.out.println("Cor vibrante!");
        } else if (cor.equals("verde")) {
            System.out.println("Cor da natureza!");
        } else {
            System.out.println("Cor não cadastrada.");
        }

       //7
       
        System.out.println("Digite uma letra");
        String letra = sc.next();
        if (letra.equalsIgnoreCase("a")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("e")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("i")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("o")) {
        	System.out.println("É uma vogal");
        } else if (letra.equalsIgnoreCase("u")) {
        	System.out.println("É uma vogal");
        } else {
        	System.out.println("Não é uma vogal");
        }
		
	}

}
