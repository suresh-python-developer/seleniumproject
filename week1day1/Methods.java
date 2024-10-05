package week1day1;

public class Methods {
		
		public String launchbrowser() {
			System.out.println("browser launched sucessfully");
			return "chrome";
	 
		}	
	    public void loadurl() {
	    	System.out.println("application loaded sucessfully");
	}


public static void main(String[] args) {
		Methods call=new Methods();
		String name = call.launchbrowser();
		System.out.println(name);
		call.loadurl();
		
}
}


