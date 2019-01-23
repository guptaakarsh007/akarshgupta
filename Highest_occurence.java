
public class Highest_occurence {

	public static void main(String[] args) {
		String input="aaabbbbbbccddf";
		int count=0,max=-1;
		int leng=input.length();
		for(int i=0;i<leng;i++)
		{
			for(int j=0;j<leng;j++)
			{
				count=0;
				if(input.charAt(i)==input.charAt(j))
				{
					count=count+1;
				}
			}
			if(max<count)
			{
				max=count;
				System.out.println(input.charAt(i)+" "+max);
			}
		}
		

	}

}
