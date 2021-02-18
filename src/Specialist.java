 class Specialist extends Doctor {
protected String speciality;
Specialist(){
	
}
Specialist(final String str,final int num,final String addr, final String special){
	speciality=special;
}
void display() {
	super.display();
	System.out.println("speciality is"+speciality);
}
}
