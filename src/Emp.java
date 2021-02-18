
public class Emp {
int id;
String name;
Address address;
public Emp(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String[] args) {
	Address a1=new Address("hyd","telan","ind");
	Address a2=new Address("bnglre","tn","ind");
 Emp e1=new Emp(34,"jhj",a1);
 Emp e2=new Emp(994,"jhhhhj",a2);
 
 e1.display();
 e2.display();
}


	
}
