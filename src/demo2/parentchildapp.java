package demo2;

public class parentchildapp {
	public static void main(String[] args)
	{
	parent father = new parent ("Brad", 43);
	parent mother = new parent ("Angelina", 31);
	child baby = new child ("Shiloh", father, mother);
	System.out.println("Hi, my name is " +baby.getName() + "!");
	System.out.println();
	System.out.println("My father's name is " +
	baby.getFather().getName());
	System.out.println("He is " +
	baby.getFather().getAge() +" years old!");
	System.out.println();
	System.out.println("My mothers's name is " +
	baby.getMother().getName());
	System.out.println("She is " +baby.getMother().getAge() +"years old!");
	System.out.println();
	}
}
