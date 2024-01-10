package com.saito.cursojava.exerciciosAula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lâmpada lampada = new Lâmpada();
		lampada.modelo = "A30";
		lampada.tensão = "bivolt";
		lampada.pot = 15;
		lampada.cor = "Braco Azulado";
		lampada.tipoLuz = "LED";
		lampada.GarantiaMeses = 36;
		lampada.tipos = new String[4] ;
		lampada.tipos[0] = "Sem sensor de movimento";
		lampada.tipos[1] = "Refletores";
		lampada.tipos[2] = "Plafon";
		lampada.tipos[3] = "Luminárias";
		lampada.TipoAbajur = true;
		
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensão);
		System.out.println(lampada.pot+" W");
		System.out.println(lampada.cor);
		System.out.println(lampada.tipoLuz);
		System.out.println(lampada.GarantiaMeses+" meses");
		System.out.println(lampada.tipos[0]);
		System.out.println(lampada.tipos[1]);
		System.out.println(lampada.tipos[2]);
		System.out.println(lampada.tipos[3]);
		System.out.println(lampada.TipoAbajur);
		
	}
	
}
