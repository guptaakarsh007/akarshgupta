import java.util.Scanner;
public class Start_string_s {

	public static void main(String[] args) {
		
		String[] input={"ram","shyam","ram","satyam","shyam","ramesh"};
		for(int i=0;i<input.length;i++)
		{
			char word=input[i].charAt(0);
			if(word=='r')
			{
				System.out.println(input[i]);
			}
		}
	}

}
