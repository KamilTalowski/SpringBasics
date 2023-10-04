package com.talowski.observer;

public interface Observer {

	void setName(String name);

	Subject getChannel();

	void update();

	void subscibeChannel(Subject ch);

}