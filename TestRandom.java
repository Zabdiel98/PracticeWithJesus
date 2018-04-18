import java.util.Random;
public class TestRandom {
public static void main(String[]args) {
	Random rand=new Random();
	
	int [] num= new int[50];
	
	for (int i=0; i<num.length;i++) {
		num[i] = rand.nextInt(11)+20;
	}
	
	System.out.println("The numbers in the array are");
	
	for(int z=0;z<num.length;z++)
		System.out.print(num[z]+" ");
	}
}
