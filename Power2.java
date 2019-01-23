
public class Power2 {

	public static void main(String[] args) {
			int n=128;
			int r=0;
			while(n!=1 && r==0)
			{
				r=n%2;
				n=n/2;
			}
			if(r==0)
			{
				System.out.println("correct");
			}
			else
				System.out.println("not correct");

		}

	}

		
	

