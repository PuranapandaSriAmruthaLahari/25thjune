package ass3;

public class pg18 {

	public static void main(String[] args) {
		
		String name = "k";
        int yearsOfService = 4;
        double salary = 50000.0,bonus;
        if (yearsOfService >= 5) {
            bonus = 0.1 * salary; 
        } else {
            bonus = 0.05 * salary;
        }
        System.out.println("Employee Name: " + name);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
	}

}
