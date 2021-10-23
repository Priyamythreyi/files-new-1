// Copying a java array
public	class TestArrayCopyDemo {  
	    public static void main(String[] args) {  
	        char[] copyFrom = { 'c', 'p', 'r', 'i', 'y', 'a', 'n',  
	                'k', 'a', 's', 't', 'e', 'm' };  
	        char[] copyTo = new char[8];  
	  
	        System.arraycopy(copyFrom, 1, copyTo, 0, 8);  
	        System.out.println(new String(copyTo));  
	    }  
	}  
