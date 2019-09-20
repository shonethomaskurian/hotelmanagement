package combi;
import java.util.Scanner;
public class Combi {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter your n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter your r");
		Scanner scr=new Scanner(System.in);
		b=scr.nextInt();
		int fa=1,fb=1,fc=1;
		for(int i=1;i<=a;i++)
		{
	      fa=fa*i;
		}
		for(int j=1;j<=b;j++)
		{
			fb=fb*j;
		}
		for(int k=1;k<=a-b;k++)
		{
			fc=fc*k;
		}
		c=fa/(fb*fc);
		System.out.println("the ncr is "+c);
sc.close();
scr.close();
	}

}


