import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class player
{
	String name;
	int age;
	
   player(String name, int age)
   {
	this.name= name;
	this.age=age;
   }

//   public String toString()
//   {
//	return name+":"+age;
//   }
   
   //중복을 제거하기 위해서.
   
   public boolean equals(Object obj)
   {
	   if(obj instanceof player)
	   {
		   player play = (player)obj;
		   return name.equals(play.name) && age==play.age;
	   }
	   return false;
   }
  //hashCode() 1번째
//   public int hashCode()
//   {
//	   return (name+age).hashCode();
//   }
   
 //hashCode() 2번째
   public int hashCode()
   {
	   return Objects.hash(name+age);
   }
   
   
   public String toString()
   {
	  return name+":"+age;
   }
   
}

public class hastsets3and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new player("faker",23));
		set.add(new player("faker",23));

		System.out.println(set);
		
		//오버라이딩을 통해 작성된  hashCode()는 다음의 조건을 충족해야함.
		
		//1:실행중인 어플 내의 같은 객체에 대해서 여러 번 hashCode()를 호출해도 같은 int값을 반환해야함.(실행시마다 같은 int 값을 반환하지 않아도 됨.)
		player 클리드 = new player("clid",20);
		
		int hash1=클리드.hashCode();
		int hash2=클리드.hashCode();
		System.out.println(클리드);
		
		클리드.age=30;
		int hash3=클리드.hashCode();//equals메서드에 사용된 멤버변수 age를 변경한 후에  hashCode메소드를 호출한 결과이므로 다른 hashcode랑은 달라도 됨.
		System.out.println(클리드);
		
		클리드.name="김태민";
		int hash4=클리드.hashCode();
		System.out.println(클리드);
		
		//2:equals메서드에서 이용한 비교를 통해 true를 얻은 두 객체에 대해 각각 hashCode()를 호출해서 얻은 결과는 반드시 같아야함.
		player skt1 = new player("effort",22);
		player skt2 = new player("effort",22);
		
		boolean b = skt1.equals(skt2);
		
		System.out.println(b);
		
		
		int hash11=skt1.hashCode();
		int hash12=skt2.hashCode();
		
		System.out.println(b);
		
		
	}
	
}
