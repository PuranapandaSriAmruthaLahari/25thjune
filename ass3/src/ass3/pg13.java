package ass3;

public class pg13 {

	public static void main(String[] args) {
		int amount=3910,remm,q,r,t,y;
		remm=amount;
		q=amount/1000;
		System.out.println("1000 rupee notes:" +q);
		remm=remm%1000;
		r=remm/500;
		System.out.println("500 rupee notes:" +r);
		remm=remm%500;
		t=remm/100;
		System.out.println("100 rupee notes:" +t);
		remm=remm%100;
		y=remm/10;
		System.out.println("10 rupee notes:" +y);
		
		
		
		
		
	
		

	}

}
