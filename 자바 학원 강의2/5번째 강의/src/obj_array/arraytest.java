package obj_array;

public class arraytest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		��� kim = new ���("��ġ��", 50, "����");
		��� don = new ���("�����", 52, "����");
		
		kim.info();
		don.info();
		
		���[] �ΰ� = new  ���[3];
		�ΰ�[0] = new ���("���Ӹ�", 20, "����");
		�ΰ�[1] = new ���("��Ӹ�", 22, "����");
		�ΰ�[2] = new ���("�ݸӸ�", 10, "����");
		
		for (int q = 0; q<�ΰ�.length; q++)
		{
			�ΰ�[q].info();;
		}
		for (��� a : �ΰ�)
		{
			a.info();
		}
		
		int[] aa = {1,2,3,4,5};
		
		for ( int b  : aa)
		{
			System.out.print(b);
		}
}
}
