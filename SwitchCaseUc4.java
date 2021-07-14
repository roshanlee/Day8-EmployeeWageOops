
public class SwitchCaseUc4 extends PartTimeUC3 {
	
	private int dailyWage;
	private int empCheck ;
	public SwitchCaseUc4(int wagePerHr, int fullHr, int partHr) {
		super(wagePerHr, fullHr, partHr);
	}

	public void PartTimeWage() {
		empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck) {
		case isFullTime:
			dailyWage = wagePerHr * fullHr;
			System.out.println(dailyWage);
			break;
		case isPartTime:
			dailyWage = wagePerHr * partHr;
			System.out.println(dailyWage);
			break;
		default:
			System.out.println("Employee is Absent" + dailyWage);

		}
	}
}