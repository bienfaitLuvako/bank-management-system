package rawbank.utils;

public class Account {

	public static String getAccountNumberCode() {
		int randomNumber = ( int )( Math.random() * 9999999 );
		if(randomNumber<=1000000) {
		    randomNumber = randomNumber + 1000000;
		}
		return "RB"+randomNumber+"KCD";
	}
}
