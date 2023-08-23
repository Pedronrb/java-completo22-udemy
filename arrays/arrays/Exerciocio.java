package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exerciocio {
	public static void main(String[] args) {
		
		double[] notasAlunosA = new double[3];
		System.out.println(Arrays.toString(notasAlunosA));
		
		notasAlunosA[0] = 3;
		notasAlunosA[1] = 4.5;
		notasAlunosA[2] = 6.5;
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA = totalAlunoA + notasAlunosA[i];
		}
		System.out.println(totalAlunoA / notasAlunosA.length);
	
		double[] notasAlunosB = {6.9,5.5,6.7};
	
		double totalAunoB = 0;
		for(int i = 0; i < notasAlunosB.length; i++) {
			totalAunoB += notasAlunosB[i];
			
		}
		
		System.out.println(totalAunoB / notasAlunosB.length);
	}
}
