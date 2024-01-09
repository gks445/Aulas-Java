
public class Aula32 {

	public static void main(String[] args) {
		
		int[] a = new int [4];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		
		
		
		for(int i=0;i<=3;i++) {
			
			System.out.println(a[i]);
			
		}
		
		int [] b = {1,2,3,4,5};
		
		try {
			
		for(int i=0;i<=4;i++) {
			
			System.out.println(b[i]);
			
		}
		
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
