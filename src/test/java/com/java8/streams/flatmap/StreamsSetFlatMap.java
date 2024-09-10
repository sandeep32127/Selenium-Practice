package com.java8.streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetFlatMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setEmpname("Sandeep");
		emp1.addDevices("iphone");
		emp1.addDevices("google");
		emp1.addDevices("laptop");
		emp1.addDevices("huawei");
		
		Employee emp2 = new Employee();
		
		emp2.setEmpname("Bitto");
		emp2.addDevices("mac");
		emp2.addDevices("android");
		emp2.addDevices("laptop");
		emp2.addDevices("desktop");
				
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> collect = empList.stream().map(e -> e.getDevices()).flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
		
		collect.forEach(x -> System.out.println(x));
	}

}
