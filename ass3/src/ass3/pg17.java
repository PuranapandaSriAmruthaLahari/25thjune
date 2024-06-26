package ass3;

public class pg17 {

	public static void main(String[] args) {
		int marks=400,percentage;
		percentage=(marks*100)/1000;
		System.out.println(" percentage:" +percentage);
		if(percentage>=60)
			System.out.println("O");
		else if(percentage>=50 )
			System.out.println("A");
		else if(percentage>=40)
			System.out.println("B");
		else if(percentage>=30)
			System.out.println("C");
		else if(percentage>=20)
			System.out.println("D");
		else
			System.out.println("F");
		
	

	}

}
