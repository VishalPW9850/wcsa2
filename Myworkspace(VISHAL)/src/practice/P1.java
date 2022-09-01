package practice;

public class P1 {
	static int a=10;
	
	public static void m2() 
	{
		System.out.println("m2");
		
	}
	public void m1()
	{
		P1 obj1 = new P1();
//		System.out.println(this.a);
//		System.out.println(obj1.a);
//		System.out.println(P1.a);
//		System.out.println(a);
	}
	public static void main(String[] args) {
		P1 obj=new P1();
		//System.out.println(obj.a);
		obj.m1();
		m2();
		P1.m2();
		//this.m2();
		obj.m2();
	}

}
