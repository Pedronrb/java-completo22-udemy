package coleções;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		HashMap<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1, "Roberto");
		usuario.put(20, "Ricardo");
		usuario.put(3, "Rafaela");
		usuario.put(4, "Rebeca");
		
		System.out.println("Metodos, têm varios");
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		
		
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		
		System.out.println("Contains chave");
		System.out.println(usuario.containsKey(20));
		System.out.println("Contains value");
		System.out.println(usuario.containsValue("Rebeca"));
		
		System.out.println(usuario.get(20));
		System.out.println(usuario.remove(1));
		System.out.println(usuario.remove(1, "Roberto"));
		
		System.out.println("Percorrer por chave");
		for (int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("Percorrer por valor");
		for (String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		System.out.println("Percorrer por ambos");		
		for (Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		
	}
}
