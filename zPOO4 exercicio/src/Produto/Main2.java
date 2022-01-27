package Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rodar usuario = new Rodar();
		System.out.print("Name: ");
		usuario.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		usuario.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		usuario.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Employee: " + usuario.name + ", $" + usuario.NetSalary());
		
		System.out.println();
		System.out.println();
		
		System.out.print("Which percentage to incrase salary? ");
		usuario.percentage = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Updated data: " + usuario.name + ", $" + (usuario.IncraseSalary() + usuario.NetSalary()));
		sc.close();
	}

}
