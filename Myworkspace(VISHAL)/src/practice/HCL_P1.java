package practice;
import java.util.Scanner;
public class HCL_P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int unit=sc.nextInt();
		int n=sc.nextInt();

		if(unit==1) 
		{
			System.out.println(n*1000);
		}

		else if(unit==2) 
		{
			System.out.println(n*100000);
		}

		else if(unit==3) 
		{
			System.out.println(n*1000000);
		}
	}
}