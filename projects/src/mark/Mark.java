package mark;
import java.util.Scanner;
public class Mark {
	

	public static void main(String[] args) {
		System.out.println("enter marks");
		Scanner s=new Scanner(System.in);
		int arrSize=5,i;
		int temp=0;
		int arr[]=new int[arrSize];
		for( i=0;i<arrSize;i++)
		{ 
			arr[i]=s.nextInt();
		}
		for( i=0;i<arrSize;i++)
		{
			for (int j=i;j<arrSize;j++) {
				if(arr[i] < arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
				arr[j]=temp;
				}
			}	
		}
		System.out.println("the prority of mark is");
		for( i=0;i<arrSize;i++)
		{ 
			System.out.println(arr[i]);
		
		}
		s.close();
		 
		
	}

}
