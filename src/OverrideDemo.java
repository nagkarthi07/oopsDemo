class Bank{
	int getRateOfInterest()
	{
		return 0;
	}
	}
class SBI extends Bank{
	int getRateOfInterest()
	{
		return 7;
	}
	
	}
class AXIS extends Bank
{
	int getRateOfInterest() {
	return 9;
}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI s=new SBI();
AXIS A=new AXIS();
System.out.println(s.getRateOfInterest());
	}

}
