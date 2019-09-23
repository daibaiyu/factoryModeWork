package com.dby.demo;

public class WhiteMachineFactory implements IMachineFactory{

	public IRobot getRobot() {
		return new WhiteRobot();
	}

	public ICar getCar() {
		return new WhiteCar();
	}

}
