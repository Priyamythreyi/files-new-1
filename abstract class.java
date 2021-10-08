//Example of abstract class that has abstract method
	abstract class Bike{  
	  abstract void run();  
	}  
	  
	public class tvs extends Bike{  
	void run(){System.out.println("running safely..");}  
	  
	public static void main(String args[]){  
	 Bike obj = new tvs();  
	 obj.run();  
	}  
	}
