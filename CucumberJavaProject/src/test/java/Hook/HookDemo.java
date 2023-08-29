package Hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookDemo {
	
	@Before
	public void before()
	{
		System.out.println("just before ");
	}
	
	@After
	public void after()
	{
		System.out.println("just after");
	}
	

	@Before("@rajesh")
	public void before1()
	{
		System.out.println("just before1 ");
	}
	
	@After("@akila")
	public void after1()
	{
		System.out.println("just after1");
	}
	
 	

}
