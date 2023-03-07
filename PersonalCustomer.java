package bankapp;

public class PersonalCustomer extends Customer {
	private String homephone ;
	private String workphone;
	public PersonalCustomer() {
		super();
		homephone = "+9183456856953";
		workphone = "+9184859400334";
		
	}
    public PersonalCustomer(String firstname,String lastName,String address,Account account,String homephon,String phonenum) {
    	super(firstname,lastName,address,account);
    	this.homephone = homephone;
    	this.workphone = phonenum;
    	
    }
    public PersonalCustomer(long custID,String firstname,String lastName,String address, Account account,String homephone,String phonenum ) {
           super(custID,firstname,lastName,address,account);
    this.homephone = homephone;
    this.workphone = phonenum;
    }

    public String getEmail() {
    	return homephone;
    }
    public void setEmail(String email) {
    	this.homephone = email;
    }
    public String getPhonenum() {
    	return workphone;
    }
    public void setPhonenum(String phonenum) {
    	this.workphone = phonenum;
    }
    public String toString() {
    	return "PersonalCustomer["+super.toString()+"Home phone: "+homephone+",workphone:"+workphone+"]";
    }
    }
    	
    	
    	
    	
    	
    	
   
