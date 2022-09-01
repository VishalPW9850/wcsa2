package practice;
import java.util.Scanner;
import java.util.*;
class P2{
	static int cntDistinct(String str)
	{
		HashSet<Character> s = new HashSet<Character>();

		for(int i = 0; i < str.length(); i++)
		{
			s.add(str.charAt(i));
		}

		return s.size();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(cntDistinct(str));
	}
}
