package corejava.encapsulation;
class Account{
	int accNumber;
	String holderName;
	int balance;
	String eMail;
	
	public int getaccNumber() {
		return accNumber;
	}
	public void setaccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getholderName() {
		return holderName;
	}
	public void setholderName(String holderName) {
		this.holderName = holderName;
	}
	
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
}

public class BankDetails {
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setaccNumber(124);
		obj.setholderName("dundi");
		obj.setbalance(1045);
		obj.seteMail("asd@gmail.com");

		System.out.println(obj.getaccNumber() + " " + obj.getholderName() + " " + obj.getbalance() + " " + obj.geteMail());
	}
}
