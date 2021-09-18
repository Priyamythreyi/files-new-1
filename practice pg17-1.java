//Java Runtime Polymorphism
	class Bank{  
    int getRateOfInterest(){return 0;}  
	}  
	  
	class ICICI extends Bank{  
	int getRateOfInterest(){return 5;}  
	}  
	  
	class SBI extends Bank{  
	int getRateOfInterest(){return 6;}  
	}  
	class HDFC extends Bank{  
	int getRateOfInterest(){return 7;}  
	}  
	  
public	class Test3{  
	public static void main(String args[]){  
	Bank b1=new ICICI();  
	Bank b2=new SBI();  
    Bank b3=new HDFC();  
	System.out.println("ICICI Rate of Interest: "+b1.getRateOfInterest());  
	System.out.println("SBI Rate of Interest: "+b2.getRateOfInterest());  
	System.out.println("HDFC Rate of Interest: "+b3.getRateOfInterest());  
	}  
	}  
