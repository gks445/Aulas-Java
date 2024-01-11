package com.saito.cursojava.Aula27Lab;

public class ContaCorrente {

	int identificação;
	double Saldo;
	boolean status;
	double Limite;
	double SaldoCheque;
	
	double Saque(double Valor) {
		
		if ((Valor <= 0) || (Saldo<Valor)) {
			
			System.out.println("\n\nValor de Saque indisponivel na conta");
			return 0;
		}
		
		else {
			
			System.out.println("\n\nO valor de R$"+ Valor+" foi sacado.");
			return Saldo = Saldo - Valor;
		}
		
	}
	
	double Deposito(double Valor) {
		
		if (Valor <= 0) {
			
			System.out.println("\n\nValor deve ser maior que 0");
			return 0;
		}
		
		else {
			
			System.out.println("\n\nValor de R$"+Valor+" foi depositado com sucesso!");
			return Saldo = Saldo + Valor;
			
			
		}
		
	}
	void Consulta() {
		
		System.out.println("\n\nO saldo atual é de R$"+Saldo+".");
		
	}
	
	
	boolean ChequeStatus() {
		
		if (SaldoCheque < Limite) {
			
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}
	
	double UsarCheque(double Valor) {
		
if ((Valor <= 0) || (SaldoCheque < Valor)) {
			
			System.out.println("\n\nLimite atingido ou valor de entrada deve ser maior que 0.");
			return 0;
		}
		
		else {
			
			System.out.println("\n\nO valor de R$"+ Valor+" foi utilizado do cheque especial.");
			return SaldoCheque = SaldoCheque - Valor;
		}
		
	}
	
	double PagarCheque() {
		
		System.out.println("\n\nO cheque especial foi pago, limite restaurado.");
		return SaldoCheque = Limite;
		
		
	}
	
	void ConsultaCheque() {
		
		System.out.println("\n\nO saldo do cheque especial atual é de R$"+SaldoCheque+".");
		
	}
	
}
