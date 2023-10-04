package com.talowski;

public class Phone 
{
	private String os;
	private int ram;
	private String processor;
	private Double screenSize;
	private int baterry;
	public Phone(String os, int ram, String processor, Double screenSize, int baterry) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.baterry = baterry;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", baterry=" + baterry + "]";
	}
	
	
	
}
