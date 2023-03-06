package assignments;

public class Employee {
	
	  private int id;
	  private String firstName, lastName,address;

	  public Employee() {

	  }
	  public Employee(int id, String fn, String ln, String add) {
	    this.id = id;
	    firstName = fn;
	    lastName = ln;
	    address = add;

	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }
	  public String getFullName() {
	    return firstName+" "+lastName;
	  }
	  public String toString() {
	    return "Employee ID " + id + "\nFirstname " + firstName + "\nLast name " + lastName;
	  }
	}



