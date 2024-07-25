package demo2;

public class parent extends person {
	private int age;
	public parent(String name, int a)
	{
	super(name);
	age = a;
	}
	public int getAge()
	{
	return age;
	}
}
