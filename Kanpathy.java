import java.util.Scanner;
public class Kanpathy {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int s0=0,s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0;
	    int n=0,k=0,r,res=0;
	    int l=s.length();
	    for(int i=0;i<l;i++)
	    {
	      if(s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='J' || s.charAt(i)=='Q' || s.charAt(i)=='Y')
	    	  s0=s0+1;
	      else if(s.charAt(i)=='B' || s.charAt(i)=='K' || s.charAt(i)=='R')
	    	  s1=s1+2;
	      else if(s.charAt(i)=='C' || s.charAt(i)=='G' || s.charAt(i)=='L' || s.charAt(i)=='S')
	    	  s2=s2+3;
	      else if(s.charAt(i)=='D' || s.charAt(i)=='M' || s.charAt(i)=='T')
	    	  s3=s3+4;
	      else if(s.charAt(i)=='E' || s.charAt(i)=='H' || s.charAt(i)=='N' || s.charAt(i)=='X')
	    	  s4=s4+5;
	      else if(s.charAt(i)=='U' || s.charAt(i)=='V' || s.charAt(i)=='W')
	          s5=s5+6;
	      else if(s.charAt(i)=='O' || s.charAt(i)=='Z')
	    	  s6=s6+7;
	      else if(s.charAt(i)=='F' || s.charAt(i)=='P')
	          s7=s7+8;
	      else
	    	  n=l;
	    }
	    k=s0+s1+s2+s3+s4+s5+s6+s7;
	    while(k!=0)
	    {
	    	r=k%10;
	    	res=res+r;
	    	k=k/10;
	    }
	    System.out.println("Result:"+res);
		}

	}

