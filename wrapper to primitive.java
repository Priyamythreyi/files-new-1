//Wrapper class Example: Wrapper to Primitive
	public class WrapperExample2{    
	public static void main(String args[]){    
	//Converting Integer to int    
	Integer a=new Integer(5);    
	int i=a.intValue();//converting Integer to int  
	int j=a;//unboxing, now compiler will write a.intValue() internally    
	    
	System.out.println(a+" "+i+" "+j);    
	}}    


