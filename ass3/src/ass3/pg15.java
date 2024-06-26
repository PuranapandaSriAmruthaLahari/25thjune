package ass3;

public class pg15 {

	public static void main(String[] args) {
		int a=15,b=25,c=35;
		if(a==b && b==c && a==c)
			System.out.println("it is an equilateral triangle");
		if (a==b && a!=c)
           System.out.println("it is an isoceles triangle");
		else
		{
			System.out.println("it is an scalene triangle");
	}
	}
}
