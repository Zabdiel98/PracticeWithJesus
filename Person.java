
public class Person {
	String name;
	int age;
	
public Person(String name, int age) {
	this.name=name;
	this.age=age;
}

public boolean isAdult() {
	if(age>18) {
		return true;
	}
	else {
		return false;
	}
}
}
