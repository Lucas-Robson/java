package primeiroprojeto;

import java.util.Scanner;

public class primera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("olá mundo");

int idade= 16;
double salario = 9000.900;
char letra = 'L'	;
String nome = "lucas";	
boolean	chuva= false;
System.out.println(idade);
System.out.println("o salário é "+ salario);
System.out.println("letra:" + letra);
System.out.println(chuva);
System.out.println("meu nome é " + nome);

int n1 = 10;
int n2 = 3;
double soma= n1 +n2;
double sub= n1 - n2;
double mult = n1 *n2;
double div=n1 /n2;
double resto = n1 %n2;

System.out.println(" a soma é " + soma);
System.out.println("a subtração é " + sub);
System.out.println("a multiplicação é "+mult);
System.out.println("a divisão é " + div);
System.out.println("resto :" + resto);

Scanner scanner = new Scanner(System.in);
System.out.println("Qual seu nome? ");
String nome1 = scanner.nextLine();
System.out.println("Olá " + nome1);

int nm1;
int nm2;
System.out.println("informe um numero:");
nm1 = scanner.nextInt();

System.out.println("informe outro numero: ");
nm2 = scanner.nextInt();

int s= nm1+nm2;
System.out.println("a soma deles é: "+ s);

int nasc;
int a = 2025;
System.out.println("ano que vc nasceu");
nasc = scanner.nextInt();
int subi= a-nasc;
System.out.println("você tem:" + subi +" anos");

double preco;
double desconto;
System.out.println("Qual o valor da compra");
preco = scanner.nextDouble();
System.out.println("Qual valor do desconto: ");
desconto = scanner.nextDouble();
double pagar = preco - desconto;

System.out.println("Pague: "+ pagar);
 
double nota1;
double nota2;
System.out.println("Qual foi a nota");
nota1= scanner.nextDouble();
System.out.println("Digite outra nota");
nota2 =scanner.nextDouble();
int notal1;
double media =(nota1 + nota2) /2;
System.out.println("Essa é a sua média " + media);


































































	}

}
