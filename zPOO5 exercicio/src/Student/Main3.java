package Student;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculos student = new Calculos();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.print("FINAL GRADE = " + student.FinalGrade());
		
		System.out.println();
		
		if(student.FinalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println();
			System.out.printf("MISSING %.2f", 60 - student.FinalGrade());
		}
		
		sc.close();
	}

}
