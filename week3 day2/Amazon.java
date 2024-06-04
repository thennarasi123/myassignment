package week3.day2;

public class Amazon extends CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Amazon am=new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.internetBanking();
		am.recordPaymentDetails();
		am.upiPayments();
	}
}