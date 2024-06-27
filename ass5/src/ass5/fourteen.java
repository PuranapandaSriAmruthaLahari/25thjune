package ass5;

import java.util.Scanner;

public class fourteen {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter side1:");
		int side1=a.nextInt();
		System.out.println("enter side2:");
		int side2=a.nextInt();
		System.out.println("enter side3:");
		int side3=a.nextInt();
		if(side1==side2 && side2==side3 && side1==side3)
			System.out.println("Three sides are equal");
		else if (side1==side2 && side1!=side3)
           System.out.println("two sides are equal");
		else
		{
			System.out.println("no two sides are equal");
		}
		

	}

}
