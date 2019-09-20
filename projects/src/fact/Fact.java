package fact;

import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		int a;
		do
		{
		System.out.println("enter your count");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int fa=0;
		for(int i=1;i<=a;i++)
		{
	      fa=fa+i;
		}
		System.out.println(" "+fa);
		}while(a<0);
	}

}

