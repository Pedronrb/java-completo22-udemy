package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		/*
		 * 	private String segredo = " ";
			String facoDentroDeCasa = " ";
			protected String formaDeFalar = " ";
			public String todosSabem = " ";
		 */
		
		Ana sogra = new Ana();
		System.out.println(sogra.segredo);
		System.out.println(sogra.facoDentroDeCasa);
		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
