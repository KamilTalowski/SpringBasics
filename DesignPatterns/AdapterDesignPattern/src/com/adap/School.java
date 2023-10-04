package com.adap;

import com.talowski.PilotPen;

public class School {
	public static void main(String a[]) {

		Pen p = new PenAdapter();
		AssigmentWork aw = new AssigmentWork();
		aw.setP(p);
		aw.writeAssigment("I heve energy to write assigment");
	}
}
