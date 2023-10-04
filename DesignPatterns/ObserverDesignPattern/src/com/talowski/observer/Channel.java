package com.talowski.observer;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Channel implements Subject {
	
	List<Subscriber> subs = new ArrayList<>();
	private String title;
	
	
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@Override
	public void subscribe(Subscriber sub) 
	{
		subs.add(sub);
		
	}
	@Override
	public void unSubscribe(Observer sub) 
	{
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscribers() 
	{
		for (Observer sub : subs) 
		{
			sub.update();
		}
	}
	
	@Override
	public void upload(String title) 
	{
		this.title = title;
		notifySubscribers();
	}
	
}
