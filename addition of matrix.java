//Addition of 2 matrices in java
public	class Testarray5{  
	public static void main(String args[]){  
	//creating two matrices  
	int a[][]={{2,3,5},{6,4,9}};  
	int b[][]={{1,2,3},{3,5,9}};  
	  
	//creating another matrix to store the sum of two matrices  
	int c[][]=new int[2][3];  
	  
	//adding and printing addition of 2 matrices  
	for(int i=0;i<2;i++){  
	for(int j=0;j<3;j++){  
	c[i][j]=a[i][j]+b[i][j];  
	System.out.print(c[i][j]+" ");  
	}  
	System.out.println();//new line  
	}  
	  
	}}  
