package ass5;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the num1:");
		int num1=a.nextInt();
		System.out.println("enter the num2:");
		int num2=a.nextInt();
		System.out.println("enter the num3:");
		int num3=a.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println("num1 is maximum");
		else if(num2>num1 && num2>num3)
			System.out.println("num2 is maximum");
		else
			System.out.println("num3 is maximum");
			
		}

}
