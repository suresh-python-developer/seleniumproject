package week1day1;


public class Secondcodee {
// TODO Auto-generated method stub
	
	public void launchbrowser( String browsername) {
		System.out.println(browsername+"browser launched sucessfully");
		
 
	}	
    public void loadurl() {
    	System.out.println("application loaded sucessfully");
}

public static void main(String[] args) {
	


	Secondcodee call=new Secondcodee();
	call.loadurl();
	call.launchbrowser("chrome");
}
}	

