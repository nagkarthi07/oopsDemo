
public class CreateContact{

	void createContact1(String name,int num) {
		System.out.println(name+" "+ num);
	}
	void createContact1(String name,int num1,int num2) {
		System.out.println(name+" "+ num1+" "+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreateContact c1=new CreateContact();
c1.createContact1("karthik",34324);
c1.createContact1("karthik",34324,432342);
	}

}
