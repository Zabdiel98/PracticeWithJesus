
public class Swap {
public static void main(String[]args) {
	
	String [] x= {"Dog","Cat","Bird","Fish"};
	
	String a=x[0];
	String b=x[2];
	
	x[0]=b;
	x[2]=a;
	
	for(int i=0; i<x.length; i++) {
		System.out.println(x[i]);
	}
	
}
}
