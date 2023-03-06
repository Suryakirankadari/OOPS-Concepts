package assignments;

	public class TalentSprint {
	    private double basePay;
	    private int hoursWorked;
	    public TalentSprint(double basePay, int hoursWorked) {
	    this.basePay = basePay;
	    this.hoursWorked = hoursWorked;
	    }
	    public TalentSprint() {
	    basePay = 0.0;
	    hoursWorked = 0;
	    }
	    public double getBasePay() {
	      return basePay;
	    }
	    public void setBasePay(double basePay) {
	      this.basePay=basePay;
	    }
	    public int getHoursWorked() {
	      return hoursWorked;
	    }
	    public void setHoursWorked(int hoursWorked) {
	      this.hoursWorked=hoursWorked;
	    }
	    public void computeSalary() {
	    if(basePay < 8.00) {
	    System.out.println("Error: base pay must be at least $8.00 per hour.");
	    return;
	    }
	    if(hoursWorked > 60) {
	      System.out.println("Error: employee cannot work more than 60 hours per week.");
	      return;
	    }

	    double totalPay = 0.0;
	    if(hoursWorked <= 40) {
	      totalPay = basePay * hoursWorked;
	    } else {
	      totalPay = 40 * basePay;
	      totalPay += (hoursWorked - 40) * (basePay * 1.5);
	    }
	    System.out.println("Total pay: $" + totalPay);
	    }
	}




