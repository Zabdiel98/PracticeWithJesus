
public class Country {
	String name;
	int pop;
	double area;


public Country(String name, int pop, double area) {
	this.name=name;
	this.pop=pop;
	this.area=area;
	
}
public String ComparePop(Country compare) {
	
	if (compare.pop> this.pop) {
		
		return compare.name;
	}
	else {
		return this.name;
	}
}
}
