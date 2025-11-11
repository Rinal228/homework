public class BankAccount{
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;

	public BankAccount(){
		this.accountNumber = "345435";
		this.ownerName = "Harry Potter";
		this.balance = 23456677;
		this.currency = "pound";
		this.isActive = true;
	}
	public BankAccount(String accountNumber, String ownerName){
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = 23456677;
		this.currency = "pound";
		this.isActive = true;
	}
	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
	}

	public void displayInfo(){
		System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency + " " + isActive);
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		if(this.balance < amount) {
			System.out.println("You are bad boy");
		} else {
			this.balance -= amount;
			System.out.println("You are lucky boy");
		}
	}
	public void activateAccount() {
		this.isActive = true;
	}
	public void deactivateAccount() {
		this.isActive = false;
	}
}