package com.talowski;

public class CompositeMain {
	public static void main(String[] a) 
	{
		Component hardrive = new Leaf(200, "hardrive");
		Component mouse = new Leaf(100, "mouse");
		Component monitor = new Leaf(1000, "monitor");
		Component ram = new Leaf(300, "Ram");
		Component cpu = new Leaf(600, "Cpu");
		
		Composite pherpipherals = new Composite("Peripherals");
		Composite cabinet = new Composite("Cabinet");
		Composite motherboard = new Composite("Motherboard");
		Composite computer = new Composite("Computer");
		
		motherboard.addComponent(cpu);
		motherboard.addComponent(ram);
		
		pherpipherals.addComponent(mouse);
		pherpipherals.addComponent(monitor);
		cabinet.addComponent(hardrive);
		cabinet.addComponent(motherboard);
		
		computer.addComponent(pherpipherals);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
		
	}
}
