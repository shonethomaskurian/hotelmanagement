package height;
import java.util.*;
public class Height {
	

	public static void main(String[] args) {
		System.out.println("enter heights");
		Scanner s=new Scanner(System.in);
		int arrSize=5,i;
		float temp=0;
		float arr[]=new float[arrSize];
		for( i=0;i<arrSize;i++)
		{ 
			arr[i]=s.nextFloat();
		}
		for( i=0;i<arrSize;i++)
		{
			for (int j=i;j<arrSize;j++) {
				if(arr[i] > arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
				arr[j]=temp;
				}
			}	
		}
		System.out.println("the heights in order are");
		for( i=0;i<arrSize;i++)
		{ 
			System.out.println(arr[i]);
		
		}
		s.close();
		 
		
	}

}
