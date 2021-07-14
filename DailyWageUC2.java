package com.bridge.OOPsPractise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DailyWageUC2 extends Uc1Oops {
   protected int wagePerHr;
   protected int fullHr;
   protected int dailyWage;
   private double empCheck;
	private final static Logger logger= Logger.getLogger("UC1_Oops");   
	public DailyWageUC2(int wagePerHr, int fullHr) {
		super();
		this.wagePerHr = wagePerHr;
		this.fullHr = fullHr;
	}

	public int getWagePerHr() {
		return wagePerHr;
	}
	
	public int getFullHr() {
		return fullHr;
	}
	
	public int getDailyWage() {
		return dailyWage;
	}
	public void DailyWage(){
		empCheck=Math.floor(Math.random()*10)%2;
	
		if(empCheck==isFullTime){
			dailyWage=wagePerHr*fullHr;
			logger.log(Level.INFO, String.valueOf(dailyWage));
		}
		else{
			logger.log(Level.INFO,"Employee is Absent"+ String.valueOf(dailyWage));
		}
	
	  }
}
