package oo.encapsulamento.casaA;

public class Paulo {
	void testeAcessos() {
		/*
		 * 	private String segredo = " ";
			String facoDentroDeCasa = " ";
			protected String formaDeFalar = " ";
			public String todosSabem = " ";
		 */
		//System.out.println(esposa.segredo);
		Ana esposa = new Ana();
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
}
