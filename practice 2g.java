//super is used to invoke parent class constructor.
	class Vehicle{  
    Vehicle(){System.out.println("Vehicle is running");}  
	}  
	  
	public class Bike4 extends Vehicle{  
	  Bike4(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is running");  
	  }  
	  public static void main(String args[]){  
	   Bike4 b=new Bike4();  
	        
	}  
	}  
