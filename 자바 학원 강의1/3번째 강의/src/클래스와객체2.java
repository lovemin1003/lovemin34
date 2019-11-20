class 파스토랄레
{
	static String 이름;
	static int 그레이드;
    static int 파워;	
    
  
    
}

class book
{
	String title;
	String author;
	int isbn;
	
	public book(String title, String author, int isbn)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		System.out.println(this.title+this.author+this.isbn);
	}
	public book(String title, int isbn)
	{
		this(title,"colorful",isbn);
		
	}
	public book()
	{
		this(null,null,0);
		System.out.println("생성자가 호출되었음");
	}
}

public class 클래스와객체2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		파스토랄레.이름 = "카논";
		파스토랄레.그레이드 = 3;
		파스토랄레.파워 = 13000;
		
		System.out.println("이름:"+파스토랄레.이름);
		System.out.println("그레이드:"+파스토랄레.그레이드);
		System.out.println("파워:"+파스토랄레.파워);
		
		book javabook = new book("pas","fina",3);
		book jababook = new book("torare",3);
		book ababook = new book();
		System.out.println(javabook.title);
	}

}
