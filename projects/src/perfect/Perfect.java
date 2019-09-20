package perfect;

import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		int a,s=0;
		System.out.println("enter your count"); 
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<a;i++)
		{
			
			if(a%i==0)
			{
				System.out.println("numbers:"+i);
			 s=s+i;
			}
		}
		System.out.println("sum  "+s);
		if(s==a)
			System.out.println("perfect num");
		else
			
			System.out.println("not perfect num");
		sc.close();
	}
	
}
