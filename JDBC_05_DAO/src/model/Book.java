package model;

public class Book {
	private String id;
	private String bookName;
	private double price;
	private int releaseYear;
	
	public Book(String id, String bookName, double price, int releaseYear) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.releaseYear = releaseYear;
	}
	
	public Book() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
}
