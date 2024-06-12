package lista;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		String nome;
	
		 System.out.println(" digite o nome: ");
		 nome =ler.next();
		 
		 for(int i=0; i<=10; i++) {
			 System.out.println(" o nome é: "+nome);
	}
		 ler.close();
	}
}
	
