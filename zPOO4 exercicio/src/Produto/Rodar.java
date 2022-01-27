package Produto;

public class Rodar {

	public String name;
	public double GrossSalary;
	public double tax;
	public double percentage;
	
	public double NetSalary() {
		return GrossSalary - tax;
	}
	
	public double IncraseSalary () {
		 return this.GrossSalary / this.percentage;
		
	}
}
