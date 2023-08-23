package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "vermelha";
		
		switch (faixa.toLowerCase()) {
		case "preta": 
			System.out.println("1");
		case "marrom": 
			System.out.println("2");
		case "roxa": 
			System.out.println("3");
		case "verde": 
			System.out.println("4");
		case "laranja": 
			System.out.println("5");
		case "vermelha": 
			System.out.println("6");
			break;
		default:
			System.out.println("Nao sei nada");
		}
		
		System.out.println("Fim");
	}
}
