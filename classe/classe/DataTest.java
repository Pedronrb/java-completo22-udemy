package classe;
public class DataTest {
	public static void main(String[] args) {
		Data d1 = new Data();
		
		var d2 = new Data(31, 12, 2022);
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2022;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirdataFormatada();
		d2.imprimirdataFormatada();
		
		
	}
}
