package com.factory;
import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {
	public static void main(String arg[]) 
	{
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		OS obj = osf.getInstance("Closed");
		obj.spec();
	}
}
