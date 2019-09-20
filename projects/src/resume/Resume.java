package resume;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resume {
	String name;
	String age;
	String degree;
	String branch;
	String contactno;
	static String i;
	Resume(String name,String age,String degree,String branch,String contactno)
	{
	this.name=name;
	this.age=age;
	this.degree=degree;
	this.branch=branch;
	this.contactno=contactno;
	}

	public static void main(String[] args) throws IOException {
		
		String name;
		String age;
		String degree;
		String branch;
		String contactno;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
		name=b.readLine();
		System.out.println("enter your age:");
		age=b.readLine();
		System.out.println("enter your degree:");
		degree=b.readLine();
		System.out.println("enter your branch:");
		branch=b.readLine();
		System.out.println("enter your contactno:");
		contactno=b.readLine();
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Degree="+degree);
		System.out.println("Branch="+branch);
		System.out.println("Contact Number="+contactno);
	}

}
