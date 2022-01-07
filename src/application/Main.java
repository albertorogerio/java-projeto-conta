package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Conta conta;
		
		double valor = 0.0;
		
		System.out.print("Enter account number: ");
		int numero = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter account holder: ");
		String nomeTitular = scan.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = scan.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = scan.nextDouble();
		}
		
		conta = new Conta(nomeTitular, numero, valor);
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		valor = scan.nextDouble();
		conta.efetuarDeposito(valor);
		
		System.out.println(conta.mostrarDados());
		
		System.out.print("Enter a withdraw value: ");
		valor = scan.nextDouble();
		conta.efetuarSaque(valor);
		
		System.out.println(conta.mostrarDados());
		
		scan.close();
		
	}

}




