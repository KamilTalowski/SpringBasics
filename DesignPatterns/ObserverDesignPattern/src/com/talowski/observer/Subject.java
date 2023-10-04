package com.talowski.observer;

public interface Subject {

	String getTitle();

	void setTitle(String title);

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}