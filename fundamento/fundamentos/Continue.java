package fundamentos;
public class Continue {
	public static void main(String[] args) {
		for(int i =0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("");
		
		for(int j = 1; j <= 10; j++) {
			if(j == 5) {
				continue;
			}
			System.out.println(j);
		}
	}	
}
