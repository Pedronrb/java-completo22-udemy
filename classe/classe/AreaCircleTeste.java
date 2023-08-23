package classe;

public class AreaCircleTeste {
	
	public static void main(String[] args) {
		
		
		AreaCircle a1 = new AreaCircle(10);
		//a1.pi = 100000;
		System.out.println(a1.area());
		
		AreaCircle a2 = new AreaCircle(5);
		AreaCircle.pi = 0;
		System.out.println(a2.area());
		
		AreaCircle.pi = 3.1415;
	}
}
