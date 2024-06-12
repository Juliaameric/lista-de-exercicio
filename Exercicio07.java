package lista;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int idade, soma=1,i=0;
		
		while(i<20) {
			System.out.println(" insira a "+i+"ª idade: ");
			idade=ler.nextInt();
			i++;
			soma= idade+soma;
		
		}
		System.out.println("o reultado da soma da idade: "+soma);
		ler.close();
		}

	}


