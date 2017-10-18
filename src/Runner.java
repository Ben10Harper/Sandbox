
public class Runner {

	public static void main(String[] args) {

		
		/*** Testing integer division -- truncates! Does NOT round off! ***/
		/*** % modulus returns the remainder of a division ***/
		int numberBits = 10;
		int bite = 8; // spelled wrong to avoid a keyword conflict byte
		int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;

		// test out 10 / 8 want 1 remainder 2
		byteAnswer = numberBits / bite;
		byteRemainder = numberBits % bite;

		System.out.println("bits = " + numberBits + " bytes = " 
		+ byteAnswer + " remainder = " + byteRemainder);

	}
}