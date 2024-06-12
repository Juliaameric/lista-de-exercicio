package lista;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int idade, soma=0, media=0;
		for(int i=1; i<=20; i++) {
			System.out.println(" insira a "+i+"ª idade: ");
			idade=ler.nextInt();
			soma= idade+soma;
		}
		media=soma/20;
		System.out.println("a media da idade é: "+media);
		ler.close();
		}
	

	}