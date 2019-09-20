package greatest;
import java.util.Scanner;
public class Great {
	

	public static void main(String[] args) {
	int  g,i;
	int temp;
		System.out.println("enter the application count");
		Scanner s=new Scanner(System.in);
		g=s.nextInt();
		System.out.println("enter the amount");
		Scanner sr=new Scanner(System.in);
		int arr[]=new int[g];
		for( i=0;i<g;i++)
		{ 
			arr[i]=sr.nextInt();
		}
		temp=arr[0];
		for( i=0;i<g;i++)
		{
			temp=arr[0];
					if(temp<arr[i])
						temp=arr[i];	
				}
				System.out.println("the wining bid id "+temp+"cr");
				s.close();
				sr.close();
	}		
}	
	


