package lista;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int idade, maior=0;
		for(int i=0; i<=20; i++) {
			System.out.println(" insira a "+i+"ª idade: ");
			idade= ler.nextInt();
			if(idade>18) {
				maior++;
			}
		}
		System.out.println(+maior+" pessoas tem mais que 18");
		ler.close();
}
}
