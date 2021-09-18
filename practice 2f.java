//Solution by super keyword
	class Vehicle{  
	  int speed=150;  
	}  
	  
	public class Bike3 extends Vehicle{  
	  int speed=200;  
	      
	  void display(){  
	   System.out.println(super.speed);//will print speed of Vehicle now  
  }  
	  public static void main(String args[]){  
	   Bike3 b=new Bike3();  
	   b.display();  
	     
	}  
	}  
