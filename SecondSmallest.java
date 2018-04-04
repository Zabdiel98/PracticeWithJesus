
public class SecondSmallest {
public static void main(String[]args) {
	int[] x = {7,29,18,72,20,12};
	
	int z = x[1];
    int y = x[0];
    
    
    for (int i = 0; i < x.length; i++) {
        if (x[i] < z) {
                y = z;
                z = x[i];
            } 
        else if (x[i] < y) {
                y = x[i];
            }

        }
    System.out.println(y);
}
}
