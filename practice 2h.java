 //super can be used to invoke parent class method
	class Person{  
	void message(){System.out.println("java");}  
	}  
	  
	public class Student15 extends Person{  
	void message(){System.out.println("welcome to programming language java");}  
	  
	void display(){  
	message();//will invoke current class message() method  
	super.message();//will invoke parent class message() method  
	}  
	  
	public static void main(String args[]){  
	Student15 s=new Student15();  
	s.display();  
	}  
	}  
