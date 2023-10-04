package com.talowski.observer;

public class YoutubeMain {
	public static void main(String[] a) 
	{
		Subject talowski = new Channel();
		
		Subscriber s1 = new Subscriber("Kamil");
		Subscriber s2 = new Subscriber("Artur");
		Subscriber s3 = new Subscriber("Krystian");
		Subscriber s4 = new Subscriber("Maciej");
		Subscriber s5 = new Subscriber("Bartek");
		
		talowski.subscribe(s1);
		talowski.subscribe(s2);
		talowski.subscribe(s3);
		talowski.subscribe(s4);
		talowski.subscribe(s5);
		
		talowski.unSubscribe(s3);
		
		s1.subscibeChannel(talowski);
		s2.subscibeChannel(talowski);
		s3.subscibeChannel(talowski);
		s4.subscibeChannel(talowski);
		s5.subscibeChannel(talowski);
		
		talowski.upload("How to Learn programming?");
	
	}
}
