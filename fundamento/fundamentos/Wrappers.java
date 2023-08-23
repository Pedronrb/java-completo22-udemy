package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(c.next());
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0f;
		float g = 123.0f;
		 
		System.out.println(f);
		Double d = 12345.5647;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		
		c.close();

	}
}
