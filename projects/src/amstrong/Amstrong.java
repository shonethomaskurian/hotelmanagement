package amstrong;
import java.util.*;

public class Amstrong {
	public void Amstrng()
	{
		
	int n;
	int a,b,c,d,e;
	System.out.println("Enter your number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	a=n/10;
	b=n%10;
	c=a%10;
	d=a/10;
	e=(b*b*b)+(c*c*c)+(d*d*d);
	if(e==n)
		System.out.println("its a amstrong number");
	else
		System.out.println("its not a amstrong number");
	}

	public static void main(String[] args) {
		/*System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		sc.nextInt();*/
		Amstrong am=new Amstrong();
		am.Amstrng();	
	}

}

