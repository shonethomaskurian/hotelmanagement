package fouls;
import java.util.Scanner;
public class Fouls {
	

	public static void main(String[] args) {
	int  g,i;
	int temp;
		System.out.println("enter player no");
		Scanner s=new Scanner(System.in);
		g=s.nextInt();
		System.out.println("enter the no of players");
		Scanner sr=new Scanner(System.in);
		int arr[]=new int[g];
		for( i=0;i<g;i++)
		{ 
			arr[i]=sr.nextInt();
		}
		temp=arr[0];
		for( i=1;i<g;i++)
		{
			
					if(temp>arr[i])
						temp=arr[i];	
				}
		for( i=0;i<g;i++)
		{
			
					if(temp==arr[i]) {
						System.out.println("the eligible player is player no:"+(i+1) + "("+temp+")");
					}		
					}
		s.close();
		sr.close();
}	
}
	



