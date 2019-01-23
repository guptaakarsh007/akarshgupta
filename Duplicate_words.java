
public class Duplicate_words {

	public static void main(String[] args) {
		String input="my name ram but ram name is shyam";
		String[] words=input.split(" ");
		int leng=words.length;
		for(int i=0;i<leng;i++)
		{
			if(words[i]!=null)
			{
				for(int j=i+1;j<leng;j++)
				{
					if(words[i].equals(words[j]))
					{
						words[j]=null;
					}
				}
			}
		}
		for(int k=0;k<leng;k++)
		{
			if(words[k]!=null)
			{
				System.out.println(words[k]);
			}
		}

	}

}
