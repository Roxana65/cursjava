package curs1;

public class WageCalculator {
	
	public int hoursWorked = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester tester1 = new Tester(); 
		tester1.setName("Oana");
		System.out.println(tester1.getName());
		tester1.setRatePerHour(55);
		System.out.println(tester1.getRatePerHour());
		
		Tester tester2 = new Tester();
		tester2.setName("Matei");
		System.out.println(tester2.getName());
		tester2.setRatePerHour(30);
		tester2.getName();
		
		WageCalculator Obj = new WageCalculator();
		Obj.calculateSalary(tester1.getRatePerHour());
		System.out.println(Obj.calculateSalary(tester1.getRatePerHour()));
	}
	public int calculateSalary(int plataPeOra) {
	
		int salary = plataPeOra*hoursWorked;
		return salary; } 

}
