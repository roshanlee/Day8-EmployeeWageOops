package com.bridge.OOPsPractise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Uc1Oops {
	protected int isFullTime;
	protected double empCheck;
	private final static Logger logger= Logger.getLogger("UC1_Oops");
	
	public Uc1Oops() {
		this.isFullTime = 1;
	}

	public void Check1(){
		empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isFullTime)
			logger.log(Level.INFO, "Employee is Present");
		else
			logger.log(Level.INFO, "Employee is Present");
		}
	
	

	
}
