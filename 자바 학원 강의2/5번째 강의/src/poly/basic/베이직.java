package poly.basic;

class a extends Object
{
	
}
class b extends a
{
	
}
class c extends a
{
	
}
class d extends b
{
	
}
class e extends c
{
	
}

public class ������
{
     a A = new a();
     b B = new b();
     c C = new c();
     d D = new d();
     
     //������: �ڽ� ��ü�� ��� �θ��� Ÿ���� �� �� �ִ� Ư��. �ڽ� ��ü�� ������ �θ� Ÿ������ ����ȯ�� �� ����.
     
     a q = new b();
     a w = C;
     a e = new d();
     a r = new e();
     
     b b1 = new d();
     c c1 = new e();
     
   /*  b b2 = new e();
     c c2 = new d();
     b b3 = new c(); ��Ӱ��谡 ������ �������� ������� ����.
     */
     
     
     Object o1 = new a();
     Object o2 = new b();
     Object o3 = new c();
     Object o4 = new d();
     Object o5 = "����";
     
     
     
     
}
