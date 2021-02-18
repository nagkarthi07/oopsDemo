package com.valuemomentum.training.collections;
class Sample<T>
{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClasssDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample<Integer> s1=new Sample<Integer>();
s1.setData(15);
System.out.println(s1.getData());

Sample<String> s2=new Sample<String>();
s2.setData("john");
System.out.println(s2.getData());

Sample<Float> s3=new Sample<Float>();
s3.setData(120.3f);
System.out.println(s3.getData());
	}

}
