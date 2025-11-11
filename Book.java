public class Book{
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	final MAX_YEAR = 2025;
	private static int totalBooks;

	public Book(){
		this.title = "1984";
		this.author = "Ray Bradberry";
		this.year = 1984;
		this.isAvailable = true;
		this.pageCount = 1984;
	}
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = true;
		this.pageCount = 1984;
	}
	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.pageCount = pageCount;
	}

	public void displayInfo(boolean detailed){
		if(detailed) {
			System.out.println(title + " " + author + " " + year + " " + isAvailable + " " + pageCount);
		} else {
			System.out.println(title + " " + author + " " + year);
		}
		 
	}
	public void displayInfo(){
		System.out.println(title + " " + author + " " + year + " " + isAvailable + " " + pageCount);
	}
	public void borrowBook(){
		this.isAvailable = false;
	}
	public void borrowBook(String borrowerName){
		this.isAvailable = false;
		System.out.println(borrowerName);
	}
	public void returnBook(){
		this.isAvailable = true;
	}
	public void updateYear(int newYear) {
		this.year = newYear;
	}
	public int getTotalBooks(){
		return this.totalBooks;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getYear(){
		return this.year;
	}
	public boolean getIsAvailable(){
		return this.isAvailable;
	}
	public int getPageCount(){
		return this.pageCount;
	}
	public void setTitle(String title){
		if(title == null || title == "") {
			System.out.println("Офигел?")
		} else {
			this.title = title;
		}
		
	}
	public void setAuthor(String author){
		if(author == null || author == "") {
			System.out.println("Офигел?")
		} else {
			this.author = author;
		}
		
	}
	public void setYear(int year){
		if(year > 0 && year < 2025) {
			this.year = year;
		}
		
	}
	public void getIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	public void setPageCount(int pageCount){
		if(pageCount > 0) {
			this.pageCount = pageCount;
		} else {
			System.out.println("Бан");
		}
		
	}
}