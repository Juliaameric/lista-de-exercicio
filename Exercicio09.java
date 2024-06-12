package lista;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int idade, soma=0, media=0, i=0;
		
		while(i<20) {
			System.out.println(" insira a "+i+" idade: ");
			idade=ler.nextInt();
			i++;
			soma= idade+soma;
		}
		media=soma/20;
		System.out.println(" a media da idade é: "+media);
		ler.close();
	}

}
