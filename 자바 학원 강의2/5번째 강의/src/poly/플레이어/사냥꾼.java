package poly.�÷��̾�;





public class ��ɲ� extends �÷��̾� {
	
		
		
		String beast;
		
		public ��ɲ�(String name) {//��Ʈ��+�����̽� ������ ������ �������.
			// TODO Auto-generated constructor stub
			
			super(name);
			this.beast = "�߿���";
		}
	
	void attack()
	{
		System.out.println("��� ����!");
		
		
	}
	
	
	void multishot()
	{
		System.out.println("���� �߻�!");
	}
	void info()
	{
		super.info();
		System.out.println("����:"+beast);
	}
	

}

