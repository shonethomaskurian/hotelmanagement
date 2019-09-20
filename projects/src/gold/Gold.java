package gold;
import java.util.*;
public class Gold {

	public static void main(String[] args) {
		int a;
		System.out.println("enter gold kg");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Number of Sculptors can be made is "+(a+(a/5)));
s.close();
	}

}
