package hellopack;

public class HelloWorld 
{
	private String message;
	private String name;
	
	
	public HelloWorld() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public HelloWorld(String message, String name) 
	{
		super();
		this.message = message;
		this.name = name;
	}


	public String getMessage() 
	{
		return message;
	}


	public void setMessage(String message) 
	{
		this.message = message;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	@Override
	public String toString() 
	{
		return "HelloWorld [message=" + message + ", name=" + name + "]";
	}
	
	
	
	
	
}
