package com.saito.cursojava.Aula27Lab;

public class TesteLâmpada {

	public static void main(String[] args) {
		
		Lâmpada modelo1 = new Lâmpada();
		modelo1.Status = false;
		
		System.out.println(modelo1.Status);
		
		modelo1.Ligar();
		
		System.out.println(modelo1.Status);
		
		modelo1.Desligar();
		
		System.out.println(modelo1.Status);
		
	}
	
}
