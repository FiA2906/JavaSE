package section09;

public class Book {
	
	//속성
	public String title;
	public int price;
	public int totalPage;
	public String author;
	
	public Book() { //생성자 _ 클래스명이랑 동일
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "김영우";
	}
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
		
	}

}
