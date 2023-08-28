package coleções;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); // boolean-> Boolean
		conjunto.add("Teste"); //String -> 
		conjunto.add(1); //int -> Interger
		conjunto.add('x');
		
		System.out.println("Tamanho e: " + conjunto.size());
		
		conjunto.add("Teste"); //String -> 
		conjunto.add('x');
		System.out.println("Tamanho e: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho e: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		

		HashSet nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //Uniao entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); //Interseção entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
