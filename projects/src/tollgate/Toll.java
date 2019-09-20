package tollgate;
import java.util.Scanner;
public class Toll {
	

	public static void main(String[] args) {
		int a;
		System.out.println("enter the no vehicles");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int i,h=0,l=0;
		
		int arr[]=new int[a];
		for( i=0;i<a;i++)
		{ 
			arr[i]=s.nextInt();
		}
		for(i=0;i<a;i++)
		{
			if(arr[i]>50)
			{
				h++;
			}
			if((arr[i]>0)&&(arr[i]<50))
			{
				l++;
			}
			}
		System.out.println("Number of heavy vehicles "+h+"and the number of light weight vehicles is " +l);
		s.close();
		}
}