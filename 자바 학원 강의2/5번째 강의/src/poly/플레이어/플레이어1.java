package poly.�÷��̾�;

class �÷��̾�
{
	String name;
	int atk;
	int hp;
	int level;
	�÷��̾�()
	{
		
		this.atk = 20;
		this.hp = 100;
		this.level = 1;
	}
	�÷��̾�(String name)
	{
		this();//�÷��̾�()
		
		this.name = name;
	}
	
	�÷��̾�(String name, int hp)
	{
		this(name);//�÷��̾�(name)
		
		this.hp = hp;
	}
	
	void info()
	{
		System.out.println("ĳ���� ����");
		System.out.println("�̸�:"+name);
		System.out.println("���ݷ�:"+atk);
		System.out.println("ü��:"+hp);
		System.out.println("����:"+level);
		
	}
	void attack(�÷��̾� ��)//�������� ¯�� ����. ����, ������, ��ɲ����� ������ ���� ��� ���� �����ϹǷ� �θ�� ������ Ŭ������ �÷��̾�� �����ϴ°� ����.
	{
		System.out.printf("%s�� %s���� ����\n",this.name, ��.name);
		
		
	}
	void �ñر�(�÷��̾�[] ��Ƽ)
	{
		System.out.println(this.name+": �����þ�!");
		for(�÷��̾� q: ��Ƽ)
		{int ������ = (int) (Math.random()*10 +10);
			q.hp -=������;
		System.out.println(q.name+"����"+������+"�������� ����. "+"���� ü��:"+ q.hp);
		}
	}
}
public class �÷��̾�1 {
	public static void main(String[] args) {
     // TODO Auto-generated method stub
		
		���� Ʈ���ٹ̾� = new ����(null);
		
		Ʈ���ٹ̾�.rage = 100;
		Ʈ���ٹ̾�.powercharge();
		
		Ʈ���ٹ̾�.name = "�����̾������μ�";
		Ʈ���ٹ̾�.atk = 56;
		Ʈ���ٹ̾�.level = 1;
		Ʈ���ٹ̾�.hp = 655;
		
		Ʈ���ٹ̾�.info();
������ ���� = new ������("������");
		
����.mana = 100;
����.�����Ǽ���();
		
����.name = "�����þ��� ����";
����.atk = 76;
����.level = 1;
����.hp = 455;
		
		����.info();
��ɲ� �ֽ� = new ��ɲ�("�� ��");
		
�ֽ�.beast = "����";
�ֽ�.multishot();
		
�ֽ�.name = "������Ʈ �ֽ�";
�ֽ�.atk = 60;
�ֽ�.level = 1;
�ֽ�.hp = 575;
		
�ֽ�.info();
				
}
}
