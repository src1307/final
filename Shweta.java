package hello;

public class Shweta 
{
	String name;
	int id;
	Shweta(int id,String name)
	{
		this.id=id;
		this.name=name;
				
	}
	public void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String args[])
	{
		Shweta s1=new Shweta(13,"tina");
		Shweta s2=new Shweta(14,"Meena");
		s1.display();
		s2.display();
		System.out.println("wsssuppp");
		
	}
}
