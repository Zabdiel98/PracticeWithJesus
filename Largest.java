
public class Largest {
public static void main(String[]args) {
	
	int [] x= {2,24,52,25,6};
	
	int z=x[0];
	
	for(int i=0; i<x.length; i++) {
		
		if(x[i]>z) {
			z=x[i];
		}
	}
	System.out.println(z);
}}
