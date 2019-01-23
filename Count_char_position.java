
public class Count_char_position {

	public static void main(String[] args) {
		String input="apple";
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			char word=input.charAt(i);
			int cal=word-98;
		    sum=sum+cal;
		}
		System.out.println(sum);

	}

}
