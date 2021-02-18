package Training.exceptionhandling;

public class ThrowsDemo {
	void division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs=a/b;
        System.out.println("\n The result is:"+rs);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsDemo T=new ThrowsDemo();
try {
	T.division();
}
catch(ArithmeticException Ex)
{
	System.out.print("error"+Ex.getMessage());
}
System.out.print("end of program");
	}

}
