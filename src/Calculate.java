 class Calculate {
	
		void sum()
		{
			System.out.println("overload");
		}
		void sum(int a,int b)
		{
			System.out.println("sum is"+(a+b));
		}
		void sum(String a,String b)
		{
			System.out.println("conc is"+(a+b));
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculate cal=new Calculate();
cal.sum();
cal.sum(8,5);
cal.sum("hello","world");
	}
	
}
