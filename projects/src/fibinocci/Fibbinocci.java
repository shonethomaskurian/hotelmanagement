package fibinocci;

import java.util.Scanner;
public class Fibbinocci {

	public static void main(String[] args) {
		int a;
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int c=0,b=1;
		int s;
		
		for(int i=1;i<=a;++i)
		{
			System.out.print("the fibbinocci series are"+c+" " );
			s=c+b;
			c=b;
			b=s;
			
		}
	
		sc.close();
		

	}

}

