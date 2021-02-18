
public class Complex {
double real;
double imaginary;
public Complex(double r , double i) {
	real= r;
	imaginary=i;
}
void add(Complex obj2) {
	this.real+=obj2.real;
	this.imaginary+=obj2.imaginary;
}
void display() {
	System.out.println(this.real+ " "+this.imaginary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex obj1=new Complex(0.7, 3.6);
Complex obj2=new Complex(10.3, 6.7);

 obj2.add(obj2);
 System.out.println("addition of complex number is=");
 
 obj1.display();
	

}
}
