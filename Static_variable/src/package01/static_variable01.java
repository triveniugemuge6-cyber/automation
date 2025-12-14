package package01;

public class static_variable01 {
	
	//Static variable-- inside the class outside the method
	
	static int a=50;
	String m ="automation";
	
	
	//instance method
	public void function () 
	{
      System.out.println(a);
      System.out.println(m);
	}
	public void Testing () 
	{
		System.out.println(a);
		System.out.println(m);
	}
	public void refrence () 
	{
		System.out.println(a);
		System.out.println(m);
		
	}
	//Static method
	public static void name() 
	{
		System.out.println(a);
		
	}
	public static void login ()
	{
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		static_variable01 s=new static_variable01();
		s.function();
		s.Testing();
		s.refrence();
	
		
		//name();
		//login();
		static_variable01.name();
		static_variable01.login();

	}

}
	
	

	


