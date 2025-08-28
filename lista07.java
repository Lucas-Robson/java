package primeiroprojeto;

import java.util.Scanner;

public class lista07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 
        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        if (idade < 16 || idade > 70) {
            System.out.println("Classificação especial");
        } else {
            System.out.println("Classificação regular");
        }
        System.out.println("------------------------------------");

        // 2
        System.out.print("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Informe a quantidade comprada: ");
        int quantidade = sc.nextInt();
        double total = valorProduto * quantidade;

        if (total > 200 && quantidade > 5) {
            double desconto = total * 0.15;
            double totalComDesconto = total - desconto;
            System.out.printf("Desconto de 15%% aplicado. Total: R$ %.2f%n", totalComDesconto);
        } else {
            System.out.printf("Sem desconto. Total: R$ %.2f%n", total);
        }
        System.out.println("------------------------------------");

        // 3 
        System.out.print("Frequência cardíaca (bpm): ");
        int bpm = sc.nextInt();
        System.out.print("Sente tontura? (sim/nao): ");
        String tontura = sc.next().trim().toLowerCase();
        if (bpm >= 100 || tontura.equals("sim")) {
            System.out.println("Procure atendimento médico");
        } else {
            System.out.println("Sem sinais de alerta");
        }
        System.out.println("------------------------------------");

        // 4 
        System.out.print("Informe a idade: ");
        int idadeConcurso = sc.nextInt();
        System.out.print("É residente do estado? (sim/nao): ");
        String residente = sc.next().trim().toLowerCase();
        if (idadeConcurso >= 18 && idadeConcurso <= 30 && residente.equals("sim")) {
            System.out.println("Elegível para o concurso");
        } else {
            System.out.println("Não elegível para o concurso");
        }
        
        System.out.println("------------------------------------");
        // 5
        System.out.print("Número de projetos concluídos: ");
        int projetos = sc.nextInt();
        System.out.print("Número de erros reportados: ");
        int erros = sc.nextInt();
        if (projetos > 10 && erros < 3) {
            System.out.println("Recompensa concedida");
        } else {
            System.out.println("Sem recompensa");
        }
        System.out.println("------------------------------------");

        // 6 
        System.out.print("Informe a idade: ");
        int idadeViagem = sc.nextInt();
        System.out.print("Possui passaporte válido? (sim/nao): ");
        String passaporte = sc.next().trim().toLowerCase();
        if (idadeViagem >= 18 && passaporte.equals("sim")) {
            System.out.println("Viagem autorizada");
        } else {
            System.out.println("Viagem não autorizada");
        }
        System.out.println("------------------------------------");

     
    }
}
