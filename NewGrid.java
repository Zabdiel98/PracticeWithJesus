
public class NewGrid {
public static void main(String[]args) {
	int [][] x= new int[5][5];
	
	for(int i=0; i<x.length;i++){
		for(int z=0; z<x.length;z++) {
			x[i][z]=1;
			System.out.print("%2d",x[i][z]);
			System.out.println();
		}
	}
}}
