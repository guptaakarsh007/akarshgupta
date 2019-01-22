
public class Test {
	public static int find(int[] a,int tot)
	{
	int temp,i,j;
	for(i=0;i<tot;i++)
	{
		for(j=i+1;j<tot;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
	}
	}
	
	return a[1];
}
	public static void main(String args[])
	{
		int a[]= {1,3,7,3,9,5};
		System.out.println(find(a,6));
		
	
	}

}
