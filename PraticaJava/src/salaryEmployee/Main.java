package salaryEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();	
		
		System.out.print("Name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Gross Salary: ");
		emp.setGrossSalary(sc.nextDouble());
		
		System.out.print("Tax: ");
		emp.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + emp);

		System.out.print("Wich percentage to increase salary?");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.printf("Update data: " + emp);
		
		sc.close();
	}

}
