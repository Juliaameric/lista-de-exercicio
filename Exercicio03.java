package lista;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		 int numero, soma=0;
		 
		 for(int i=0; i<=15; i++) {
		 soma = soma+i;
	
		 System.out.println(" a soma dos numeros é: " +soma);
		 ler.close();
	}
}
}
