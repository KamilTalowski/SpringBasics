package com.talowski;

public class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private Double screenSize;
	private int baterry;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBaterry(int baterry) {
		this.baterry = baterry;
		return this;
	}
	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, baterry);
	}
	
	
}
