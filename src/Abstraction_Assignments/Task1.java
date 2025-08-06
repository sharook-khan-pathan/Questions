package Abstraction_Assignments;
import java.util.*;
abstract class Payment{

	abstract void initiatePayment();
	abstract void verifyPayment();
	
	 String generateTransactionId() {
	        return UUID.randomUUID().toString();
	    }
}
class CreditCardPayment extends Payment{
	void initiatePayment() {
		System.out.println("CreditCardPayment initiatePayment");
	}
	void verifyPayment() {
		System.out.println("CreditCardPayment verifyPayment");
	}
//	String generateTransactionId(String uuid) {
//		return uuid;
//	}
}
class UPIPayment extends Payment{
	void initiatePayment() {
		System.out.println("UPIPayment initiatePayment");
		}
	void verifyPayment() {
		System.out.println("UPIPayment verifyPayment");
	}
}
class NetBankingPayment extends Payment{
	void initiatePayment() {
		System.out.println("NetBankingPayment initiatePayment");
		}
	void verifyPayment() {
		System.out.println("NetBankingPayment verifyPayment");
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment[] payments = {
	            new CreditCardPayment(),
	            new UPIPayment(),
	            new NetBankingPayment()
	        };

	        for (Payment p : payments) {
	            p.initiatePayment();
	            p.verifyPayment();
	            System.out.println("Transaction ID: " + p.generateTransactionId());
	            System.out.println();
	        }
	}

}
