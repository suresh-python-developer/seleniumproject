package abstractandothers;

public abstract class Canarabank implements Paymets{

	public void  recordpayments() {
		System.out.println("payments recorded");
		
	}
	
	public void cashondelivery() {
		// TODO Auto-generated method stub
		System.out.println("cash on delivery");
	}

	@Override
	public void upipayments() {
		// TODO Auto-generated method stub
		System.out.println("upi payments");
	}

	@Override
	public void cardpayments() {
		// TODO Auto-generated method stub
		System.out.println("card payments");
	}

	@Override
	public void internetbanking() {
		// TODO Auto-generated method stub
		System.out.println("internet banking");
	}

}
