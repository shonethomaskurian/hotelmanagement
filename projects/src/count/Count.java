package count;

import java.util.Scanner;
public class Count{
	

	public static void main(String[] args) {
		int sr,c=0;
		System.out.println("enter no of students");
		Scanner s=new Scanner(System.in);
		sr=s.nextInt();
		System.out.println("enter the marks");
		Scanner sc=new Scanner(System.in);
	       int i;
		
		int arr[]=new int[sr];
		for( i=0;i<sr;i++)
		{ 
			arr[i]=s.nextInt();
		}
		for( i=0;i<sr;i++)
		{
			if(arr[i]<50)
			c++;	
			}
		
			System.out.println("the failed student count is "+ c);
			
			s.close();
			sc.close();
			
		}

	}


