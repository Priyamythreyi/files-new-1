// Java final method
	class Bike{  
	  final void run()
	  {System.out.println("riding");}  
	}  

	public class pulsar extends Bike{  
	   void run()
	   {System.out.println("riding  safely with 80kmph");}  
	     
	   public static void main(String args[]){  
	   pulsar= new pulsar();  
	   pulsar.run();  
	   }  
     }
