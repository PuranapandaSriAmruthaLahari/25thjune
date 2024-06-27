package ass5;
import java.util.Scanner;
public class twenty1 {

	public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter ngrade:");
    int ngrade=a.nextInt();
    if(ngrade<2)
    	System.out.println("F");
    else if(ngrade>2 && ngrade<=1)
        System.out.println("D");
    else if(ngrade>3 && ngrade<=2)
    	System.out.println("C");
    else if(ngrade>4 && ngrade<=3)
    	System.out.println("B");
    else if(ngrade>5 && ngrade<=4)
       System.out.println("A");
	 

	}

	
	}


