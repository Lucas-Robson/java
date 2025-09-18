package primeiroprojeto;

import java.util.Scanner;

public class lista12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 
        int num = 10;
        do {
            System.out.println(num);
            num++;
        } while (num <= 30);

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 2
        int chute;
        do {
            System.out.print("Digite um número: ");
            chute = sc.nextInt();
        } while (chute != 5);
        System.out.println("Parabéns, você acertou!");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 3 
        int peso;
        do {
            System.out.print("Digite o peso da mala (kg): ");
            peso = sc.nextInt();
            if (peso > 23) {
                System.out.println("Peso excedido, tente novamente.");
            }
        } while (peso > 23);
        System.out.println("Peso dentro do limite!");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 4
        int dias = 1;
        int totalPaginas = 0;
        do {
            System.out.print("Digite a quantidade de páginas lidas no dia " + dias + ": ");
            totalPaginas += sc.nextInt();
            dias++;
        } while (dias <= 7);
        System.out.println("Total de páginas lidas na semana: " + totalPaginas);

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 5 
        int codigo;
        do {
            System.out.print("Digite o código de acesso (3 dígitos): ");
            codigo = sc.nextInt();
            if (codigo != 789) {
                System.out.println("Código incorreto, tente novamente.");
            }
        } while (codigo != 789);
        System.out.println("Dispositivo desbloqueado!");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 6 
        int combustivel;
        do {
            System.out.print("Digite o nível de combustível (litros): ");
            combustivel = sc.nextInt();
            if (combustivel <= 10) {
                System.out.println("Combustível baixo! Abasteça mais.");
            }
        } while (combustivel <= 10);
        System.out.println("Combustível suficiente para a viagem!");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        // 7
        int distancia;
        int totalKm = 0;
        do {
            System.out.print("Digite a distância percorrida no trecho (0 ou negativo para encerrar): ");
            distancia = sc.nextInt();
            if (distancia > 0) {
                totalKm += distancia;
            }
        } while (distancia > 0);
        System.out.println("Total de quilômetros percorridos: " + totalKm);
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}

