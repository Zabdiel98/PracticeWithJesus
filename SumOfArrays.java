
public class SumOfArrays {
public static void main(String[]args) {
	
	int [] a= {5,2,8,23,14};
	int [] b= {67,32,7,4,61};
	
	int [] x=new int[a.length];
	
	for (int i = 0; i<a.length;i++) {
		x[i]=(a[i]+b[i]);
		System.out.print(x[i]+" ");
	}
}
}
