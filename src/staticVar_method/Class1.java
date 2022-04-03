package staticVar_method;

public class Class1 {
     int a=10;
     static int b=20;
     static int c=30;
     public void S1()
     {
    	System.out.println(a); 
    	System.out.println(b); 
     }
     public static void s2()
     {
    	 Class1 ob1=new Class1();
    	 System.out.println(ob1.a); 
    	 System.out.println(b); 
     }
	public static void main(String[] args) {
	
		Class1 ob2=new Class1();
		ob2.S1();
		ob2.s2();
		
	}

}
