
public class stringex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String full = "���� �̸���";
		
		//full���� " "�� ��ġ�� ã����.
        int index = full.indexOf(" ");
        
        //full�� ù ���ں��� " "�� �ִ� ������ ���ڿ��� �����Ѵ�.
        String file = full.substring(0,index);
        
        //" "�� ���� ���ں��� �����ؼ� ���ڿ��� ������ ������.
        //full.substring(index+1, full.length());�� ������.
        String ext = full.substring(index+1);
        
        System.out.println(full+" ���� "+file);
        System.out.println(full+" �Ϳ��� "+ext);
        
	}

}
