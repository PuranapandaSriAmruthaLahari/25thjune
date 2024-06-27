package ass5;

import java.util.Scanner;

public class tenth {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter cp:");
	int cp=a.nextInt();
	System.out.println("enter sp:");
	int sp=a.nextInt();
	double profit,loss;
	if(sp>cp)
    profit=sp-cp;
	System.out.println("profit");
    if (cp>sp)
	{
	loss=cp-sp;
	System.out.println("loss");
	}
	

	}

}
