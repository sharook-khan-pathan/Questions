package ExceptionHandling;
import java.util.Scanner;
public class BankAccount {
	public double Balance = 10000;
	public void withdraw(double amount) throws IllegalArgumentException  {
		if(amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount.");
		} else if(amount > Balance) {
			throw new IllegalArgumentException("Insufficient funds. Your current balance is: " + Balance);
		} else {
			Balance = Balance - amount;
			System.out.println("Withdrawal successful. Current Balance: "+Balance);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b =new BankAccount();
		System.out.print("Enter the amount to withdraw: ");
		Scanner sc =new Scanner(System.in);
		double amount = sc.nextDouble();
		try {
				b.withdraw(amount);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}