import java.util.*;
import static java.util.Objects.*; //ObjectŬ������ �޼��带 static import

public class objectstest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str2d = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2d_2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.print("str2d:");
		for(String[] tmp: str2d)
		{
			System.out.print(Arrays.deepToString(tmp));
		}
		System.out.println();
		
		System.out.print("str2d_2:");
		for(String[] tmp: str2d_2)
		{
			System.out.print(Arrays.deepToString(tmp));
		}
		System.out.println();
		System.out.println();
		
		System.out.println(Objects.equals(str2d, str2d_2));
		System.out.println(Objects.deepEquals(str2d, str2d_2));
		//deepEquals(): ��ü�� ��������� ���ϹǷ� ������ �迭�� �񱳵� ������.
		System.out.println();
		
		System.out.println(isNull(null));
		System.out.println(nonNull(null));
		System.out.println(Objects.hashCode(null));
		System.out.println(Objects.toString(null));
		System.out.println(Objects.toString(null,"??"));
		System.out.println();
		
		Comparator c = String.CASE_INSENSITIVE_ORDER; //��ҹ��� ���� �� �ϴ� ��
		
		System.out.println(compare("aa","bb",c)); //����
		System.out.println(compare("bb","aa",c)); //�ٸ�
		System.out.println(compare("ab","AB",c)); //����
		
	
	}

}
