
public class Person5 {

	private Job job;
	 
	public Person5()
	{
		this.job=new Job();
		job.setSalary(1000L);
		job.setId(101);
		job.setRole("manager");
	}
	
	public long dispDetails()
	{
		System.out.println( job.getId()+" "+job.getSalary()+" "+job.getRole());
		return 0;
	}
}
