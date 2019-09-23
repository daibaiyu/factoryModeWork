package com.dby.demo;

public class SimpleFactory {
	public IRobot getRobot(String name){
		IRobot robot = null;
		if(name==null||name.equals("")){
			return robot;
		}
		if(name.equals("white")){
			robot = new WhiteRobot();
		}else if(name.equals("black")){
			robot = new BlackRobot();
		}
		return robot;
	}
}
