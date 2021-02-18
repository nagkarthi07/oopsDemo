package Training.exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,result;
Scanner sc=new Scanner(System.in);
System.out.println("input two ints");
a=sc.nextInt();
b=sc.nextInt();
try {
result=a/b;
System.out.println("reuslt is"+result);
	}
catch(ArithmeticException e) {
	System.out.println("Exception caught:division by zero");;
	}
finally{
	sc.close();
	System.out.println("in  finally block");
}
	}
	}
