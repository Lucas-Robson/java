package primeiroprojeto;

import java.util.Scanner;

public class lista06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if(num >= 10 && num <= 20) {
            System.out.println("Número dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        // 2 
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Possui convite? (sim/nao): ");
        String convite = sc.nextLine();
        if(idade >= 18 && convite.equalsIgnoreCase("sim")) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }

        // 3 
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        if(idade < 12 || idade > 60) {
            System.out.println("Categoria especial");
        } else {
            System.out.println("Categoria normal");
        }

        // 4 
        System.out.print("Valor do produto: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.print("Forma de pagamento (avista/cartao): ");
        String pagamento = sc.nextLine();
        if(valor > 100 && pagamento.equalsIgnoreCase("avista")) {
            valor *= 0.9;
        }
        System.out.println("Valor final: " + valor);

        // 5 
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        sc.nextLine();
        System.out.print("Possui sintomas? (sim/nao): ");
        String sintomas = sc.nextLine();
        if(temp >= 38 || sintomas.equalsIgnoreCase("sim")) {
            System.out.println("Recomenda-se procurar um médico.");
        } else {
            System.out.println("Sem sinais preocupantes.");
        }

        // 6 
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("É brasileiro? (sim/nao): ");
        String brasil = sc.nextLine();
        if(idade >= 16 && brasil.equalsIgnoreCase("sim")) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar.");
        }

        // 7 
        System.out.print("Horas extras: ");
        int horasExtras = sc.nextInt();
        System.out.print("Número de faltas: ");
        int faltas = sc.nextInt();
        if(horasExtras > 20 && faltas < 5) {
            System.out.println("Ganha bônus");
        } else {
            System.out.println("Não ganha bônus");
        }

        // 8
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Possui carteira de motorista? (sim/nao): ");
        String carteira = sc.nextLine();
        if(idade >= 18 && carteira.equalsIgnoreCase("sim")) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir.");
        }

        // 9 
        System.out.print("Nota média (0 a 10): ");
        double nota = sc.nextDouble();
        System.out.print("Frequência (0 a 100): ");
        double freq = sc.nextDouble();
        if(nota >= 8 && freq >= 80) {
            System.out.println("Bolsa concedida");
        } else {
            System.out.println("Bolsa não concedida");
        }

        // 10
        System.out.print("Temperatura ambiente: ");
        double temperatura = sc.nextDouble();
        System.out.print("Umidade (%): ");
        double umidade = sc.nextDouble();
        if((temperatura < 18 || temperatura > 26) && umidade > 60) {
            System.out.println("Ajustar climatização");
        } else {
            System.out.println("Climatização não necessária");
        }
    }
}
