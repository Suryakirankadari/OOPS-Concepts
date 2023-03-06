package assignments;

public class FullTimeEmployee extends Employee {
	
	  private double basic;
	  private double bonus;

	  public FullTimeEmployee() {
	    super();
	    basic = 0.0;
	    bonus = 0.0;
	}
	  public FullTimeEmployee(int id, String firstName, String lastName, String address, double basic, double bonus) {
	    super(id, firstName, lastName, address);
	    this.basic = basic;
	    this.bonus = bonus;
	}
	  public double computeSal() {
	    return basic + bonus;
	  }
	  public void showDetails() {
	    System.out.println("Full Name: " + getFullName());
	    System.out.println("ID: " + getId());
	    System.out.println("Address: " + getAddress());
	    System.out.println("Salary: Rs." + computeSal());
	  }
	}



