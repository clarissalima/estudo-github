import java.util.Locale;
import java.util.Scanner;

public class Oi {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double base = sc.nextDouble();
			double altura = sc.nextDouble();
			
			double area = base * altura;
			double perimetro = 2.0 * (base + altura);
			double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
			
			System.out.printf("AREA = %.2f\n", area);
			System.out.printf("PERIMETRO = %.2f\n", perimetro);
			System.out.printf("DIAGONAL = %.2f\n", diagonal);
		}
		

	}

}
