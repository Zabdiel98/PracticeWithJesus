
public class Books_Main {
public static void main(String[]args) {
	Books books=new Books("John Green", 2014, 54321, 17.99);
	
	System.out.println("The author is"+" "+books.author);
	System.out.println("It was written in"+" "+books.year);
	System.out.println("The ISBN number is"+" "+books.isbn+" "+"and it is"+" "+books.price);
	
	Books book=new Books("Rainbow Rowell", 2016, 87594, 12.99);
	
	System.out.println("The author is"+" "+book.author);
	System.out.println("It was written in"+" "+book.year);
	System.out.println("The ISBN number is"+" "+book.isbn+" "+"and it is"+" "+book.price);
	
}
}
