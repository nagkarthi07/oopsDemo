import java.util.Scanner;

class Trainee
{
	int tId;
	String tName;
	String technology;
	float Salary,stipend;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,salary of trainee");
		tId=sc.nextInt();
		tName=sc.next();
		technology=sc.next();
		Salary=sc.nextFloat();
	}
	float calculate(){
		stipend=Salary-200;
		return stipend;
	}
	void display() {
		System.out.println("trainee name"+ tName);
		System.out.println("trainee id"+ tId);
		System.out.println("technology"+ technology);
		//System.out.println("Salary"+ Salary);
	}
}

public class TestTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trainee t1=new Trainee();
Trainee t2=new Trainee();
t1.input();
t1.display();
t2.display();


float s1=t1.calculate();
System.out.println("stipend is"+s1);
	}

}
