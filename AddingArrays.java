
public class AddingArrays {
public static void main(String[]args) {
	
	int [] x= {3,2,1};
	int [] y= {3,2,1};
	
	int [] z= new int[3];
	
	for (int i=0; i<x.length; i++) { 
		z[i]=(x[i]+y[i]); 
		System.out.println(z[i]);
	}
	
	
}
}
