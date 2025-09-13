package day_2;

public class SalaryCalculator 
{
	public static void main(String[] args) {
		double basicSalary=30000;
		double hra=0.10*basicSalary;
		double da=0.05*basicSalary;
		double totalSalary=basicSalary+hra+da;
		System.out.println("basicSalary: "+basicSalary);
		System.out.println("HRA (10%): "+hra);
		System.out.println("DA (5%): "+da);
		System.out.println("Total Salary: "+totalSalary);
	}

}
