
public class Smallest {
public static void main(String[]args) {
	int [] list= {3,21,64,1,7,6};
	
	int smallest=list[0];
	
	for (int i=0; i<list.length;i++) {
		if (list[i]<smallest) {
			smallest=list[i];
		}
	}
	System.out.println(smallest);
}
}
