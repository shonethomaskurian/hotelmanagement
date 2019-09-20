package factorial;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int a;
		System.out.println("enter your name alphabet count");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int fa=1;
		for(int i=1;i<=a;i++)
		{
	      fa=fa*i;
		}
		System.out.println("the combination are "+fa);
sc.close();
	}

}
