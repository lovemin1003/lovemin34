class �Ľ������
{
	static String �̸�;
	static int �׷��̵�;
    static int �Ŀ�;	
    
  
    
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
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}
}

public class Ŭ�����Ͱ�ü2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�Ľ������.�̸� = "ī��";
		�Ľ������.�׷��̵� = 3;
		�Ľ������.�Ŀ� = 13000;
		
		System.out.println("�̸�:"+�Ľ������.�̸�);
		System.out.println("�׷��̵�:"+�Ľ������.�׷��̵�);
		System.out.println("�Ŀ�:"+�Ľ������.�Ŀ�);
		
		book javabook = new book("pas","fina",3);
		book jababook = new book("torare",3);
		book ababook = new book();
		System.out.println(javabook.title);
	}

}
