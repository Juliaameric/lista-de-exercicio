package lista;

import java.util.Scanner;

class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int numero, soma=0;
		
		for(int i=0; i<=11; i++) {
			System.out.println(" insira o "+i+"numero: ");
			numero=ler.nextInt();
			soma= numero+soma;
		}
		System.out.println("o reultado da soma é: "+soma);
		ler.close();
		}
	}
