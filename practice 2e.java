//super is used to refer immediate parent class instance variable.
//Problem without super keyword
	class Vehicle{  
	  int speed=100;  
	}  
public class Bike2 extends Vehicle{  
	  int speed=150;  
	  void display(){  
	   System.out.println(speed);//will print speed of Bike   
	  }  
	  public static void main(String args[]){  
	   Bike2 b=new Bike2();  
	   b.display();  
	}  
	}  
