package coleções;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Carlos"));
		
	}
	
	
}
