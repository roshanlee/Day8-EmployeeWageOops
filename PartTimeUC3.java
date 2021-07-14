package com.bridge.OOPsPractise;

public class PartTimeUC3 extends DailyWageUC2 {
	protected int isPartTime=2;
	protected int partHr;
	private double empCheck;
	public PartTimeUC3(int wagePerHr, int fullHr,int partHr) {
		super(wagePerHr, fullHr);
		this.partHr=partHr;
	}
	
	public void PartTimeWage() {

		if (empCheck == isFullTime) {
			dailyWage = wagePerHr * fullHr;
			System.out.println(dailyWage);
		} else if (empCheck == isPartTime) {
			dailyWage = wagePerHr * partHr;
			System.out.println(dailyWage);

		} else {
			System.out.println("Employee is Absent" + dailyWage);
		}
	}

}
