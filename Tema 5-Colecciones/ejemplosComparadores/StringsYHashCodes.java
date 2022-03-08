package ejemplosComparadores;

import java.util.Scanner;
import java.util.HashSet;

public class StringsYHashCodes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> palabras = new HashSet<>();

		String s1 = "uno";
		String s1bis = "uno";
		String s2 = "dos";
		String s3 = "tres";

		palabras.add(s1);
		palabras.add(s1bis);
		palabras.add(s2);
		palabras.add(s3);
		palabras.add(s1bis);

		for (String s : palabras)
			System.out.println(s);
		
		System.out.println(s1 == s1bis);
		System.out.println(s1.equals(s1bis));

		System.out.println("Introduce uno");

		s1bis = sc.nextLine();

		System.out.println(s1.hashCode());
		System.out.println(s1bis.hashCode());

		System.out.println(s1 == s1bis);
		System.out.println(s1.equals(s1bis));

		palabras.add(s1bis);

		for (String s : palabras)
			System.out.println(s);

	}

}
