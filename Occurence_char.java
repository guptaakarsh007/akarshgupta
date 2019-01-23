
public class Occurence_char {

	public static void main(String[] args) {
		String input="aabbbcc";
		int count=0,max=-1;
		int leng=input.length();
		for(int i=0;i<leng;i++)
		{
			count=0;
			for(int j=0;j<leng;j++)
			{
				max=0;
				if(input.charAt(i)==input.charAt(j))
				{
					count++;
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


