package dataTypes;

public class BankAccount {
Long account_number= 768767878l;
String name= "abhinaya";
int balance = 899;

public void getBalance() {
	System.out.println(" the balance is " + balance );
}

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
//		
//		ba.account_number();
//		ba.balance();
//		ba.name();
		ba.getBalance();
	}

}
