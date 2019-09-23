package com.dby.demo;

public class WhiteRobotFactory implements IRobotFactory{

	public IRobot getRobot() {
		return new WhiteRobot();
	}

}
