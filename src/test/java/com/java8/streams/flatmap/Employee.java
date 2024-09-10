package com.java8.streams.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	
	private String empname;
	private Set<String> devices = new HashSet<String>();
	
	public void addDevices(String deviceName) {
		this.devices.add(deviceName);
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	
	

}
