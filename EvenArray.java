
public class EvenArray {
public static void main(String[]args) {
	double[] a= {1.0,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
	
	for (int i=0; i<a.length; i++) {
		int x=(i%2);
		
		if (x==0) {
			System.out.println(a[i]);
		}
	}
}}

