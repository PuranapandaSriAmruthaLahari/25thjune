package ass5;
import java.util.Scanner;
public class twenty3 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter age:");
		int age=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("enter nationality:");
		String nationality=b.nextLine();
		if(age>18 && nationality.equalsIgnoreCase("india")) {
			System.out.println("eligible to vote");}
		else if(age<18) {
			System.out.println("not eligible to vote");}
	
	

	}

}
