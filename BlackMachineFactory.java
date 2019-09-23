package com.dby.demo;

public class BlackMachineFactory implements IMachineFactory{

	public IRobot getRobot() {
		return new BlackRobot();
	}

	public ICar getCar() {
		return new BlackCar();
	}

}
