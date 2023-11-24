import java.util.*;
public class Q1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Strings");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println("The length of the first String is "+s1.length());
		System.out.println("The length of the second String is "+s2.length());
		if(s1.length()==s2.length())
		System.out.println("The length of the two string are same");
		else 
		System.out.println("The length of the two strings are not same");
		if(s1.equals(s2))
		System.out.println("The strings are equal");
		else 
		System.out.println("The strings are not equal");
        sc.close();
	}
}
