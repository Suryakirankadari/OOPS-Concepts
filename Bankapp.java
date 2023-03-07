package bankapp;

import java.util.List;
import java.util.Scanner;

public class Bankapp {

	public static void main(String[] args) {
		Bank b1= new Bank();
		int options;
		do {
			System.out.println("Bank Menu\n1. Add a Customer\n2. Display all Customers\n3. Display Customer by ID\n4. Display no of Customers\n5.Credit(Deposit)\n6.Debit(Withdrawl)\n7.Transfer\n8. Exit");
			Scanner sc = new Scanner(System.in);
			options= sc.nextInt();
			sc.nextLine();
			switch(options) {
			case 1: System.out.print("Enter your first name : ");
				String Fn = sc.nextLine();
				System.out.print("Enter your last name : ");
				String Ln = sc.nextLine();
				System.out.print("Enter your Address : ");
				String Add = sc.nextLine();
				System.out.print("Enter the Account number: ");
				String  accNo= sc.next();
				System.out.print("Enter the name: ");
				String accName = sc.nextLine();
				System.out.print("enter your type of customer(p for personal,c for commercial):");
				char custType = sc.next().charAt(0);
				sc.nextLine();
				if(custType =='p') {
					System.out.println("enter your home phone");
					String homeph = sc.nextLine();
					System.out.println("enter your work phone");
					String workph = sc.nextLine();
				Account a =new Account(accNo,accName);
				Customer a1 = new PersonalCustomer(Fn,Ln,Add,a,homeph,workph);
				b1.addCustomer(a1);
				}
				if(custType =='c') {
					System.out.print("enter your contact phone: ");
					String contactPh = sc.nextLine();
					System.out.print("enter your contact person name:");
					String contactperson = sc.nextLine();
					Account a =new Account(accNo,accName);
					Customer a1 = new CommericialCustomer(Fn,Ln,Add,a,contactPh,contactperson);
					b1.addCustomer(a1);
				}
				System.out.println("This customer is successfully added to My Bank.");
				break;
			case 2: List<Customer> custs = b1.getCustomers();
					if(b1.getCustCount()==0) {
						System.out.println("No customers in bank. Add customers to view.");
					}else {
						for(int i=0;i<b1.getCustCount();i++) {
						System.out.println(custs.get(i));
					}
					}
				break;
			case 3:	System.out.println("Enter customer ID");
					long cID= sc.nextInt();
					System.out.println(b1.getCustomerByID(cID));
					break;
			case 4: System.out.println(b1.getCustCount());
					break;
			case 5: System.out.print("Enter your Customer ID: ");
					long cId=sc.nextLong();
			 		System.out.print("Enter the amount to deposit: ");
			 		int amount=sc.nextInt();
			 		Customer c =b1.getCustomerByID(cId);
			 		if(c!=null) {
			 		Account depAcc= c.getAccount();
			 		depAcc.credit(amount);
			 		}else {
			 			System.err.println("ERror customer not found");
			 		}
			 		System.out.println("Successfully credited "+amount);
			 		break;
			case 6: System.out.print("Enter your Customer ID: ");
					long cid=sc.nextLong();
					System.out.print("Enter the amount to withdraw: ");
					int amount1=sc.nextInt();
					Customer c2 =b1.getCustomerByID(cid);
					if(c2!=null) {
				 		Account depAcc= c2.getAccount();
				 		depAcc.debit(amount1);
				 		}else {
				 			System.err.println("customer not found");
				 		}
					Account withdrawAcc= c2.getAccount();
					withdrawAcc.debit(amount1);
					System.out.println("Successfully debited "+amount1);
					break;
			case 7: System.out.print("Enter your Customer ID: ");
					long ciD=sc.nextLong();
					System.out.print("Enter the amount to transfer: ");
					int amount2=sc.nextInt();
					System.out.print("Enter Customer ID amount to be transfered: ");
					long cid1=sc.nextLong();
					Customer c3 =b1.getCustomerByID(ciD);
					Customer c4 =b1.getCustomerByID(cid1);
					Account transAcc= c3.getAccount();
					Account transAcc2= c4.getAccount();
					transAcc.transferTo(transAcc2,amount2);
					System.out.println("Successfully transfered "+amount2);
					break;
			case 8: System.out.println("Thank you for using our Banking App.");
					System.exit(0);
			default:
				System.out.println("Enter value within in 1 to 7.");
		}
	}while(options!=8);
		}
	}


