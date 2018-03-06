
public class Country_Test {
public static void main(String[]args) {
	
	Country China=new Country("China", 54565, 897.98);
	Country Japan=new Country("Japan", 43678, 645.98);
	
	
	String x=Japan.ComparePop(China);
	
	System.out.println(x+" "+"has the greatest population");
	
}

}
