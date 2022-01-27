package entitles;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Program2 triangle = new Program2();
		System.out.println("Enter rectangle widht and height: ");
		triangle.width = sc.nextDouble();
		triangle.height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("AREA = " + triangle.area());
		System.out.println("PERIMETER = " + triangle.perimeter());
		System.out.println("DIAGONAL = " + Math.sqrt(triangle.diagonal()));
		
		
		
		
		sc.close();

	}

}
