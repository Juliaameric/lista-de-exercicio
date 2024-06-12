package lista;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int idade, soma=1;
		
		for(int i=1; i<=20; i++) {
			System.out.println(" insira a "+i+"ª idade: ");
			idade=ler.nextInt();
			soma= idade+soma;
		}
		System.out.println("o reultado da soma da idade: "+soma);
		ler.close();
		}
	

	}


