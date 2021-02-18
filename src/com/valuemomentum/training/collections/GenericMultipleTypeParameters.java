package com.valuemomentum.training.collections;
class Employee10

{
	private String name;

	
	public Employee10(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}
}

interface pair<K,V>
{
	public K getKey();
	public V getValue();
}
class OrderedPair<K,V> implements pair<K,V>{
	private K key;
	private V value;
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
		
	public K getKey() {
		return key;
}

@Override
public V getValue() {
		return value;
}
	
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OrderedPair<Integer,String> op1=new OrderedPair<Integer,String>(101,"ssss");
System.out.println(op1.getValue()+""+op1.getKey());

OrderedPair<Integer,Employee10> op2=new OrderedPair<Integer,Employee10>(101,new Employee10("mava"));
System.out.println(op2.getValue()+""+op2.getKey());
	}

}
