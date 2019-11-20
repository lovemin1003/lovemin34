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

public class 베이직
{
     a A = new a();
     b B = new b();
     c C = new c();
     d D = new d();
     
     //다형성: 자식 객체가 모든 부모의 타입을 쓸 수 있는 특성. 자식 객체는 언제든 부모 타입으로 형변환될 수 있음.
     
     a q = new b();
     a w = C;
     a e = new d();
     a r = new e();
     
     b b1 = new d();
     c c1 = new e();
     
   /*  b b2 = new e();
     c c2 = new d();
     b b3 = new c(); 상속관계가 없으면 다형성이 적용되지 않음.
     */
     
     
     Object o1 = new a();
     Object o2 = new b();
     Object o3 = new c();
     Object o4 = new d();
     Object o5 = "하하";
     
     
     
     
}
