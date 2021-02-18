
class Doctor {
protected String name;
protected int idNumber;
protected String address;

Doctor()
{
	}
Doctor(final String str,final int num,final String addr){
	name=str;
	idNumber=num;
	address=addr;
}
void display() {
	System.out.println("name is"+name);
	System.out.println("no. is "+idNumber);
	System.out.println("address is"+address);

}
}
