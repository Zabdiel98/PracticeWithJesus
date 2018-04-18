
public class MiddleIndex {
public static void main(String[]args) {
	
	int [] a= {3,8,16};
	int [] b= {9,72,14};
	
	int [] z= new int[2];
	
	
	z[0]=a[a.length/2];
	z[1]=b[b.length/2];
	
	System.out.println("The new array is");
	System.out.println(z[0]+" "+z[1]);
	
}
}
