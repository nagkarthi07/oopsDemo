package com.valuemomentum.training.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {
Set<Employee> emp=new HashSet<Employee>();

Employee e1=new Employee(100,"dsds",1000);
Employee e2=new Employee(200,"dsdaas",13000);
Employee e3=new Employee(300,"dssds",10030);
Employee e4=new Employee(400,"eedsds",10020);

emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);

for(Employee e:emp) {
	System.out.println(e.id+e.name+e.sal);
}
}
