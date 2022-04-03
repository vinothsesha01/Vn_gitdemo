package variablepractise;

public class Class1 {
	 static int a=300;
	
	public void method1()
	{
	
		System.out.println(a);
	}
	public void method2()
	{
		
	
		int a=30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Class1 t1=new Class1();
		Class2 t2=new Class2();
		t1.method1();
		t1.method2();
		t2.Class2();

	}

}
