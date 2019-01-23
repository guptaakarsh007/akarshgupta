import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int c=0;
		int arr1[]={2,4,5,1};
		int arr2[]={7,0,3,9,6};
		int len1=arr1.length;
		int len2=arr2.length;
		int arr3[]=new int[len1+len2];
		int len3=arr3.length;
		for(int i=0;i<len1;i++)
		{
			arr3[i]=arr1[i];
			c++;
		}
		for(int j=0;j<len2;j++)
		{
			arr3[c++]=arr2[j];
			
		}
		Arrays.sort(arr3);
		int med=len3/2;
		System.out.println(arr3[med]);

	}

}
