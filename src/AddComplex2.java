
public class AddComplex2 {
	double hours;
	double minutes;
	double seconds;
	
	public AddComplex2(double hr , double min,double sec) {
		hours= hr;
		minutes=min;
		seconds=sec;
		
		
	}
	void Time() {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	void add(AddComplex2 obj2) {
	
	this.seconds+=obj2.seconds;
	if(this.seconds>60) {
		this.seconds-=60;
		ssec++;
		
	}
	}
	void display() {
		System.out.println(this.hours+ ":"+this.minutes+":"+this.seconds);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddComplex2 obj1=new AddComplex2(10,45,60);
		AddComplex2 obj2=new AddComplex2(3,55,05);

		
		}
	}

}
