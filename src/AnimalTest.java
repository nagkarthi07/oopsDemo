
class Animal {
String name;
void eat()
{
	System.out.println("eat the");
}
}
class Dog extends Animal
{
	void display() {
		System.out.println("name is"+name);
	}
}

public class AnimalTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog s1=new Dog();
s1.name="karu";
s1.display();
s1.eat();
	}
}

