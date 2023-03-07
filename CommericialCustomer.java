package bankapp;

public class CommericialCustomer extends Customer{
			private String contactPhone;
			private String conPerson;
			public CommericialCustomer() {
				super();
				contactPhone="";
				conPerson="";
			}
			public CommericialCustomer(String fn,String lastName,String address,Account account,String contactPhone,String conPerson) {
				super(fn,lastName,address,account);
				this.contactPhone=contactPhone;
				this.conPerson=conPerson;
			}
			public CommericialCustomer(long custID,String firstName,String lastName,String address,Account account,String contactPhone,String conPerson) {
				super(custID,firstName,lastName,address,account);
				this.contactPhone=contactPhone;
				this.conPerson=conPerson;
			}
			public String getPhoneNum() {
				return contactPhone;
			}
			public void setPhoneNum(String phoneNum) {
				this.contactPhone=phoneNum;
			}
			public String getConPerson() {
				return conPerson;
			}
			public void setConPerson(String conPerson) {
				this.conPerson=conPerson;
			}
			
			public String toString() {
				return "Commercial Customer["+super.toString()+"contat phone: "+contactPhone+", Contact Person: "+conPerson+"]";
			}
		}

