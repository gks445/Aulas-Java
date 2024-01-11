package com.saito.cursojava.Aula27Lab;
import java.util.Scanner;


public class ContaCorrenteTeste {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.identificação = 150921;
		conta.Saldo = 1000.0;
		conta.status = false;
		conta.Limite = 500;
		conta.SaldoCheque = 500;
		int aux = 1;
		
		do {
		System.out.println("\nQual operação deseja realizar?\n1-Saque\n2-Deposito\n3-Consulta de Saldo\n4-Consulta Limite Cheque Especial\n5-Consultar se a conta é especial\n6-Consultar se o Cheque especial está em uso\n7-Consultar Saldo Cheque especial\n8-Usar Cheque Especial\n9-Pagar Cheque Especial\n0-Teste das funções");
		
		Scanner ler = new Scanner(System.in);
		int opcao = ler.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("\n\nEntre com o valor a ser sacado: ");
			double ValorSaque = ler.nextDouble();
			conta.Saque(ValorSaque);
			break;
			
		case 2:
			System.out.println("\n\nEntre com o valor a ser depositado: ");
			double ValorDeposito = ler.nextDouble();
			conta.Deposito(ValorDeposito);
			break;
			
		case 3:
			conta.Consulta();
			break;
			
		case 4:
			conta.ConsultaCheque();
			break;
			
		case 5:
			System.out.println("\n\nEsta é uma conta especial? "+conta.status);
			break;
			
		case 6:
			System.out.println("\n\nO cheque especial está sendo utilizado? "+conta.ChequeStatus());
			break;	
		
		case 7:
			conta.ConsultaCheque();
			break;
			
		case 8:
			System.out.println("\n\nEntre com o valor a ser utilizado: ");
			double ValorCheque = ler.nextDouble();
			conta.UsarCheque(ValorCheque);
			break;
			
		case 9:
			conta.PagarCheque();
			break;
			
		case 0:
			conta.Consulta();
			conta.Saque(10);
			conta.Consulta();
			
			conta.Deposito(200);
			conta.Consulta();
			
			System.out.println("\n\nO cheque especial está sendo utilizado? "+conta.ChequeStatus());
			conta.ConsultaCheque();
			
			conta.UsarCheque(100);
			
			System.out.println("\n\nO cheque especial está sendo utilizado? "+conta.ChequeStatus());
			conta.ConsultaCheque();
			
			conta.PagarCheque();
			
			System.out.println("\n\nO cheque especial está sendo utilizado? "+conta.ChequeStatus());
			conta.ConsultaCheque();
			break;
		}
		
		System.out.println("\n\nDeseja realizar outra operação?\n1-Sim\n2-Não");
		
		Scanner ler2 = new Scanner(System.in);
		aux = ler2.nextInt();
		
		}while(aux == 1);
		
		System.out.println("\nFim de operação!");
		
	}
	
}
