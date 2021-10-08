//dynamic binding
	class Animal{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	 public class cat extends Animal{  
	 void eat(){System.out.println("cat is eating...");}  
	  
	 public static void main(String args[]){  
	  Animal a=new cat();  
	  a.eat();  
	 }  
	}  
