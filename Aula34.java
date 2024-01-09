
import java.util.Scanner;


public class Aula34 {

	public static void main(String[] args) {
		
		int [][] a = {{1,2,3,4},{5,6,7},{8,9},{10}};
		
		for(int i=0;i<a.length;i++) {
		
		
		System.out.println(a[i].length);
		
		}
		
		int  [][] b = new int[4][4];
		
		Scanner ler;
		
		
		ler = new Scanner(System.in);
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				System.out.println("Entrada: ");
				b[i][j] = ler.nextInt();
				
			}
		}
			
			for(int i=0;i<b.length;i++) {
				
				for(int j=0;j<b.length;j++) {
					
					System.out.println(b[i][j]);
					
				}	
			
		}
		
		
		
			
	}
	
	}

