package unsynch;

public class UnsynchBankTest {
	public static final int NACCOUNTS = 100;
	public static final double INTTAL_BALANCE = 1000;

	public static void main(String[] args) {
		Bank b = new Bank(NACCOUNTS, INTTAL_BALANCE);
		int i;
		for (i = 0; i < NACCOUNTS; i++) {
			TransferRunnable r = new TransferRunnable(b, i, INTTAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}
