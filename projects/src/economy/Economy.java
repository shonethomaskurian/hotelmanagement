package economy;
import java.util.Scanner;
public class Economy {
	

	public static void main(String[] args) {
		int n,i,j,k;
		float avg = 0,f = 0,c=0;
		
		System.out.println("enter no of bowlers");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter runs conceded  by bowlers");
		float arr[]=new float[n];
		for(  i=0;i<n;i++)
		{ 
			arr[i]=sc.nextInt();
		}
		System.out.println("enter no of bowls for each bowlers");
		float arri[]=  new float[n];
		for( j=0;j<n;j++) {
			arri[j]=sc.nextInt();
			}
		
			float aar[]=new float[n];
			for( k=0;k<n;k++)
			{
				aar[k]=(arr[k]/(arri[k]/6));
				
			}
			System.out.println("the ecomy of the bowlers is");
			for( k=0;k<n;k++)
			{
				System.out.println(aar[k]);
				
			}
			for( k=0;k<n;k++)
			{
				 avg=avg+aar[k];
				 
				 
				
			}
			f=(avg/n);
			System.out.println("the average of team"+avg/n);
			if(aar[k]<f)
				c++;
			System.out.println("the no eligible players"+c);
			
		sc.close();
		
		
			
		
	}

}


