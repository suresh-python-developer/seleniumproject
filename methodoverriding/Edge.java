package methodoverriding;

public class Edge extends Browser {
    
	public void openurl() {
		System.out.println("www.facebook.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Edge  ee = new Edge();
       ee.openurll();
    		   
	}

}
