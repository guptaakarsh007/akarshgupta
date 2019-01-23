
public class Power5 {

	public static void main(String[] args) {
		int n=25;
		int r=0;
		while(n!=1 && r==0)
		{
			r=n%5;
			n=n/5;
		}
		if(r==0)
		{
			System.out.println("correct");
		}
		else
			System.out.println("not correct");

	}

}
