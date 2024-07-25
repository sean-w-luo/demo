package demo2;

public class child extends person {
	private parent myFather;
	private parent myMother;
	public child (String name, parent dad, parent mum)
	{
	super(name);
	myFather = dad;
	myMother = mum;
	}
	public parent getFather()
	{
	return myFather;
	}
	public parent getMother()
	{
	return myMother;
	}
}
