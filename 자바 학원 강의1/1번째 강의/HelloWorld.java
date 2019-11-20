
public class HelloWorld {

	public static void main(String[] args){
		System.out.println("Hello World");
	//ㅋㅋㅋ	 
		int a = 5;
		System.out.println(a);
		
		int decimalValue = 7;
		int binValue = 0b1000_0101;
		int octalValue = 077;
		int hexaValue = 0xFEFE;
		
		System.out.println("10진수 7:"+ decimalValue );
		System.out.println("2진수 100000101:"+ binValue);
		System.out.println("8진수 77:"+ octalValue);
		System.out.println("16진수 FEFE:"+ hexaValue);
		
		char q = 'a';
		char w = '\t';
		char e =  '\uAC00'; //16진수 4자리 입력('가' 자를 출력함)
		String r = "\uD604\uC218";
		String t = "kanon";
		System.out.printf("%c,%c,%c,%s,%s\n", q,w,e,r,t);
		
		byte s = 100;
		int d = s;
		byte f = (byte)d;
		System.out.printf("%d,%d,%d\n",s,d,f);
		
		int z = 32;
		byte x =(byte)z;
		System.out.println(x);
		
		System.out.println("\n아무거나\n 해보자\t.");
		
		int qq = 1;
		int ww = qq++;
		int rr = 1;
		int ee = ++rr;
		
		//후위 연산자
		System.out.println(qq);
		System.out.println(ww);
		//전위 연산자
		System.out.println(rr);
		System.out.println(ee);
		
		int bin = 0b1000_1000;
		System.out.println(bin);
		System.out.println(~bin);
		System.out.println((byte)0b1111_0111);
		System.out.println((byte)0b0111_0111);
		
		boolean isTrue = false;
		System.out.println(!isTrue);
		
		char aa = 'a';
     // char ss = aa + 1; 에러
		char ss = 'a' + 1;
		System.out.println(ss);
		
		float qw = 9.124231f;
		float shortqw = (int)(qw*1000)/ 1000F;
		System.out.println(shortqw);
		
		byte ao = 8;
		byte bo = 119;
		int as = 16;
		int bs = as<<33; //(33%32)
		
		System.out.println(ao & bo); //and
		System.out.println(ao | bo); // or
		System.out.println(ao ^ bo); //xor
		System.out.println(ao >> 2);
		System.out.println(ao << 8);
		System.out.println(ao >>> 1);
		System.out.println(bs);
		
		if((ao == 8) && (bo == ao))
		{
			System.out.println("참");
		}
		else
		{
			System.out.println("거짓");
		}
		System.out.printf("%d,%d\n",ao, bo);
		
		if((as == 16) || (bs == 19))
		{
			System.out.println("참");
		}
		else
		{
			System.out.println("거짓");
		}
		System.out.printf("%d,%d\n",as, bs);
		 
		int x1 = 10 - (int)(Math.random()*10);
		if(args.length > 0) {
			x1 = Integer.parseInt(args[0]);
		}
		
		int c = (x1>=0) ? x1 : -x1;
		System.out.println(x1 +"의 절대값:" + c);
		
		int v = 5;
		int h = 3;
		v += 4; //v = v + 4;
		h =+ 6; //h= +6;
		System.out.printf("%d,%d\n",v, h);
		
	}
		}
