package classe;

public class AreaCircle {
	double raio;
	static double pi;
	
	AreaCircle(double raioInicial){
		pi = 1.14;
		raio = raioInicial;
		
	}
	
	double area() {
		return pi * Math.pow(raio,2);
		
	}
}
