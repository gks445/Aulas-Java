package com.saito.cursojava.Aula27Lab;

public class Lâmpada {

	String modelo;
	String tensão;
	int pot;
	String cor;
	String tipoLuz;
	int GarantiaMeses;
	String[] tipos;
	boolean TipoAbajur;
	boolean Status;
	
	boolean Ligar () {
		
		System.out.println("Lâmpada foi Ligada");
		return Status = true;
	}
	
	boolean Desligar() {
		
		System.out.println("Lâmpada foi Desliga");
		return Status = false;
	}
	
}	
