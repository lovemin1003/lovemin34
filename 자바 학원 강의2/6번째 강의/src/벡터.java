import java.util.Vector;

public class ���� {

	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(4);
		v.add(3);
		v.add(-3);
		
		//���� �߰��� �����ϱ�
		v.add(2,90);//3�� -3 ���̿� ���� 90 ����
		
		System.out.println("���� ���� ��� ��ü ��:"+v.size());
		System.out.println("������ ���� �뷮:"+v.capacity());
		
		//��� ��� ���� ����ϱ�
		for(int i =0; i<v.size(); i++)
		{
			int q = v.get(i);
			System.out.println(q);
		}

	}

}
