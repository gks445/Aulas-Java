import java.util.Scanner;


public class Aula33 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		Scanner leer;
		leer = new Scanner(System.in);
		
		int i;
		
		for(i=0;i<a.length; i++) {
			
			System.out.println("informe um numero: ");
			a[i] = leer.nextInt();
			
		}
		
		for(i=0;i<a.length; i++) {
			
			System.out.println(a[i]);
			
			
		}
		
	}
	
}
