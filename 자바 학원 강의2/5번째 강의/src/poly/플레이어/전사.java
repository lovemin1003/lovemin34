package poly.�÷��̾�;





public class ���� extends �÷��̾� {

	
		
		
		int rage;
		//���� ������ ����.
		����(String name)
		{
			super(name);//�θ� Ŭ�������� ��ӹ޾� ��. �� ���� ��� ��.
			System.out.println("���� ������ ȣ��");
			//super(name);//�� �׷��� ���� ����.
			this.hp = 90;
			
			this.rage = 40;
			
		}
		����()
		{
			
		}
		
		
	
	



	void attack()
	{
		System.out.println("������!");
		
		
	}
	
	public void powercharge() {
		// TODO Auto-generated method stub
		System.out.println("���Ѵٸ�!");
	}
	//�޼��� �������̵�: �θ� Ŭ�����κ��� ��ӹ��� �޼��带 �ڽ� Ŭ�������� ����� �ٲ㼭 ����ϴ� ��.
	void info()
	{
		super.info();
		System.out.println("�г�:"+rage);
	}

}

