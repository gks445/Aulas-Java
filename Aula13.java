import java.util.Scanner;

public class Aula13 {

	public static void main(String[] args) {
		
		System.out.println("Entre com seu nome:  ");
		Scanner lernome = new Scanner(System.in);
		String nome = lernome.next();
		
		System.out.println("Entre com sua idade:  ");
		Scanner leridade = new Scanner(System.in);
		String idade = leridade.next();
		
		System.out.println("meu nome é "+nome+" e tenho "+idade+" anos.");
	}
	
}
