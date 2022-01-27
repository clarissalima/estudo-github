import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, raio, n;
		n = 3.14159;
		raio = sc.nextDouble();
		area = n*Math.pow(raio, 2.0);
		
		
		System.out.printf("A = %.4f", area);
		
		
		sc.close();
	

	}

}
