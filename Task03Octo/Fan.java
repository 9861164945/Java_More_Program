package com.Task03Octo;

public class Fan {
	String name;
	String coil;
	int wings;

	
	public void SwitchOn() {
		System.out.println("Switch  on the fan");
	}
	public void SwitchOff() {
		System.out.println(" SwitchOff the fan");
	}
	
	public String fanDetails() {
		return "[Fan name:"+name+", fan coil is"+coil+",in that fan there are "+wings+"wings"+"]";
		
	}
}
