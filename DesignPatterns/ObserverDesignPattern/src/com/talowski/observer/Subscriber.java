package com.talowski.observer;

public class Subscriber implements Observer 
{
	private String name;
	private Subject channel;
	
	

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public Subject getChannel() {
		return channel;
	}


	@Override
	public void update() 
	{
		System.out.println("Hey " + name + " video uploaded "+channel.getTitle());
	}

	@Override
	public void subscibeChannel(Subject ch) 
	{
		channel = ch;
	}
	
}
