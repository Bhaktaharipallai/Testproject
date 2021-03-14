
public class Classandobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		p1.age=24;
		p1.name="raja";
        p2.age=34;
        p2.name="sunil";
		System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);
        p1.walk();
        p1.walk(2);
        p2.eat();
	}

}
class Person
{
	int age;
	String name;
	public Person()
	{
		System.out.println("creating object");
	}
	void walk()
	{
		System.out.println(name+"walking.");
	}
	void eat()
	{
		System.out.println(name+"eating.");
	}
	void walk(int steps)
	{
		System.out.println(name+"walked"+steps);
	}
	
}
