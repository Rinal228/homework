public class BankAccount{
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	private static int totalAccounts = 0;
	private final String BANK_NAME = "Национальный Банк";

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
	public void  displayInfo(boolean showStatus){
		if(showStatus) {
			displayInfo();
		} else {
			System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency);
		}
		
	}
	public void deposit(double amount) {
		if(isActive){
			this.balance += amount;
		} 
		
	}
	public void deposit(double amount, String description) {
		deposit(amount);
		System.out.println(description);
	}
	public void withdraw(double amount) {
		if(isActive){
			if(this.balance < amount) {
				System.out.println("You are bad boy");
			} else {
				this.balance -= amount;
				System.out.println("You are lucky boy");
			}
		} 
		
	}
	public void  withdraw(double amount, String purpose) {
		withdraw(amount);
		System.out.println(purpose);
	}
	public static double calculateInterest(double amount, double rate, int years) {
		double result = 1;
		for(int i = 0; i < year; i++) {
			result *= (1 + rate / 100);
		} 
		return amount * result;
	}
	public void activateAccount() {
		this.isActive = true;
	}

	public void deactivateAccount() {
		this.isActive = false;
	}
	public String getAccountNumber(){
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public String getOwnerName(){
		return this.ownerName;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		if(balance >= 0 && balance <= 1000000000) {
			this.balance = balance;
		} else {
			System.out.println("Хватит");
		}
		
	}
	public String getCurrency(){
		return this.currency;
	}
	public void setCurrency(String currency){
		this.currency = currency;
	}
	public boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}
}