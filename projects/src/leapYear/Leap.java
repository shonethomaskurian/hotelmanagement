package leapYear;
import java.util.*;
		public class Leap {
		
			public static void main(String[] args) {
				int y;
				System.out.println("enter your year");
				Scanner sc=new Scanner(System.in);
				y=sc.nextInt();
		        if(y % 4 == 0)
		        {
		            if( y % 100 == 0)
		            {
		              
		                if ( y % 400 == 0)
		                	System.out.println(y + " is a leap year.");
		                else
		                	System.out.println(y + " is not a leap year.");
		            }
		            else
		            	System.out.println(y + " is a leap year.");
		        }
		        else
		        	System.out.println(y + " is not a leap year.");
		        sc.close();
		    }
		}
				


				
				

		



