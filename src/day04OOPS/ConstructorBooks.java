package day04OOPS;

public class ConstructorBooks {
	String title;
	String author;
	int price;
	public ConstructorBooks(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public ConstructorBooks(String title, String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	public ConstructorBooks() {
		this.title = "unknown";
		this.author = null;
		this.price = 800;
		
	}
//	#chaining
	public ConstructorBooks(String title) {
		this.title = title;
		this.author = "Vishnu" ;
		this.price = 400;
		
	}
	public ConstructorBooks(ConstructorBooks book) {
		this.title = book.title;
		this.author = book.author ;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method 
		ConstructorBooks book1 = new ConstructorBooks("Harry Potter", "j.krowling");
		ConstructorBooks book5 = new ConstructorBooks("Harry Potter", "j.krowling",320);
		ConstructorBooks book2 = new ConstructorBooks();
		ConstructorBooks book3 = new ConstructorBooks("abcd");
		ConstructorBooks book4 = new ConstructorBooks(book1);
		
		ConstructorBooks [] books = {book1,book2,book3,book4,book5};
		
		for (ConstructorBooks book : books) {
			System.out.println(book.title+" "+ book.author+" "+book.price);

		}
//		System.out.println(book1.title+" "+ book1.author+" "+book1.price);
//		System.out.println(book2.title+" "+ book2.author+" "+book2.price);
//		System.out.println(book3.title+" "+ book3.author+" "+book3.price);
//		System.out.println(book4.title+" "+ book4.author+" "+book4.price);
//		System.out.println(book5.title+" "+ book5.author+" "+book5.price);
		

	}

}
