
public class ��Ʈ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "java";
		String b = ",lava";
		//���ڿ� ����
		a = a.concat(b);
		System.out.println(a);
		//���� ����
		a = a.trim();
		System.out.println(a);
		//���ڿ� ��ġ
		a = a.replace("ja","gua");
		System.out.println(a);
		//���ڿ� �и�
		String s[] = a.split(",");
		for(int i = 0; i<s.length; i++)
			System.out.println("�и���"+i+"�� ���ڿ�:"+s[i]);
		//���� ��Ʈ��
		a = a.substring(3);
		System.out.println(a);
		//���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
		
		
	}

}
