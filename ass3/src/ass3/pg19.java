package ass3;

public class pg19 {

	public static void main(String[] args) {
		
		int sub1 = 85,sub2=78,sub3=90,totalmarks,percentage;
		String division;
        totalmarks = sub1 + sub2 + sub3;
        percentage = (totalmarks * 100) / 300;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50) {
            division = "Second Division";
        } else if (percentage >= 40) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Division: " + division);
	}

}
