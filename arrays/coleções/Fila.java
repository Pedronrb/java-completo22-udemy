package coleções;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//add e offer adicionam elementos na fila. Diferença é o comportamento qnd a fila esta cheia.
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//Peek e element - obter o proximo elemento da fla sem removê-lo
		//Diferença é o comportamento 
		//Qnd a fila está vazia
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		
		// fila.size(); tamanho
		//fila.clear(); limpa
		//fila.isEmpty(); vazio  
		
		System.out.println(fila.poll());
		
		System.out.println();
	}
}
