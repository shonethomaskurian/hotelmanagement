package tenthMark;
import java.util.*;
public class Tenth {
	

	public static void main(String[] args) {
		int sr;
		System.out.println("enter no of students");
		Scanner s=new Scanner(System.in);
		sr=s.nextInt();
		System.out.println("enter the marks");
		Scanner sc=new Scanner(System.in);
	       int i,st=0;
		
		int arr[]=new int[sr];
		for( i=0;i<sr;i++)
		{ 
			arr[i]=s.nextInt();
		}
		for( i=0;i<sr;i++)
		{
			st=st+arr[i];
				
			}
		
			System.out.println(("the average is "+(st/sr)));
			
			s.close();
			sc.close();
			
		}

	}

