package coleções;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//Podemos criar um objeto assim:
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		//Ou podemos criar um objeto assim:
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Mari"));
		lista.add(new Usuario("Lipe"));
		lista.add(new Usuario("Jr"));
		
		
		System.out.println("Pelo indice: " + lista.get(5).nome + "\n");
		
		System.out.println("Pelo indice: " + u1.toString());
		
		//Implicitamente ao chamar nome, vem o metodo toString
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println(" \n");
		
		//Explicitamente ao chamar nome, podemos chamar o metodo toString
		for(Usuario u: lista) {
			System.out.println(u.toString());
		}
		System.out.println(" \n");
		
		
		System.out.println(">>> " + lista.remove(1));
		System.out.println(lista.remove(2));
		System.out.println(lista.remove(new Usuario("Pedro")));
		
		System.out.println("Tem ? " + lista.contains(new Usuario("Mari")));
	}
	
	
}
