package com.talowski;

public class Shop 
{
	
	public static void main(String a[]) {
		Phone p= new PhoneBuilder().setOs("android").setRam(2).setBaterry(3600).getPhone();
		
		
		
		System.out.println(p);
	}
}
