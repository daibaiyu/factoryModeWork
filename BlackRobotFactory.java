package com.dby.demo;

public class BlackRobotFactory implements IRobotFactory{

	public IRobot getRobot() {
		return new BlackRobot();
	}

}
