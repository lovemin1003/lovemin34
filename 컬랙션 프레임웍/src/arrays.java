<<<<<<< HEAD
import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int [][] arr2d = {{10,20},{30,40}};
		
		System.out.println(Arrays.toString(arr));//1차원 배열
		System.out.println(Arrays.deepToString(arr2d));//다차원 배열
		System.out.println();
		
		// 배열의 복사
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		int[] arr2 = Arrays.copyOf(arr, 2);
		int[] arr3 = Arrays.copyOf(arr, 6);
		int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
		int[] arr5 = Arrays.copyOfRange(arr, 0, 8);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		int[] arr6 = new int[5];//배열 채우기
		Arrays.fill(arr6, 9);
		System.out.println(Arrays.toString(arr6));
		System.out.println();
		
		
		//setAll()은 배열을 채우는데 쓸 함수형 인터페이스를 매개변수로 받는다.
		Arrays.setAll(arr6,i->(int)(Math.random()*9+1));
		System.out.println(Arrays.toString(arr6));
		System.out.println();
		
		for(int i : arr6)
		{
			char[] graph = new char[i];
			Arrays.fill(graph, '@');
			System.out.println(new String(graph)+i);
		}
		System.out.println();
		
		//다차원 배열 비교시엔 deepEquals()를 써야한다.
		String [][] str2d = new String[][] {{"테트라","쿼레"},{"닌자","사무라이"}};
		String [][] str2d2 = new String[][] {{"테트라","쿼레"},{"닌자","사무라이"}};
		
		System.out.println(Arrays.equals(str2d,str2d2));
		System.out.println(Arrays.deepEquals(str2d,str2d2));
		System.out.println();
		
	    char[] charr = {'s','d','q','b','o'};
	    System.out.println(Arrays.toString(charr));
	    System.out.println(Arrays.binarySearch(charr,'o'));//정렬하지 않으면 결과가 제대로 안 나옴.
	    System.out.println();
	    
	    Arrays.sort(charr);//정렬
	    System.out.println(Arrays.toString(charr));
	    System.out.println(Arrays.binarySearch(charr,'o'));//정렬시켜야 제대로 결과가 나옴.
	    System.out.println();
	}

}
=======
import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int [][] arr2d = {{10,20},{30,40}};
		
		System.out.println(Arrays.toString(arr));//1차원 배열
		System.out.println(Arrays.deepToString(arr2d));//다차원 배열
		System.out.println();
		
		// 배열의 복사
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		int[] arr2 = Arrays.copyOf(arr, 2);
		int[] arr3 = Arrays.copyOf(arr, 6);
		int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
		int[] arr5 = Arrays.copyOfRange(arr, 0, 8);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		int[] arr6 = new int[5];//배열 채우기
		Arrays.fill(arr6, 9);
		System.out.println(Arrays.toString(arr6));
		System.out.println();
		
		
		//setAll()은 배열을 채우는데 쓸 함수형 인터페이스를 매개변수로 받는다.
		Arrays.setAll(arr6,i->(int)(Math.random()*9+1));
		System.out.println(Arrays.toString(arr6));
		System.out.println();
		
		for(int i : arr6)
		{
			char[] graph = new char[i];
			Arrays.fill(graph, '@');
			System.out.println(new String(graph)+i);
		}
		System.out.println();
		
		//다차원 배열 비교시엔 deepEquals()를 써야한다.
		String [][] str2d = new String[][] {{"테트라","쿼레"},{"닌자","사무라이"}};
		String [][] str2d2 = new String[][] {{"테트라","쿼레"},{"닌자","사무라이"}};
		
		System.out.println(Arrays.equals(str2d,str2d2));
		System.out.println(Arrays.deepEquals(str2d,str2d2));
		System.out.println();
		
	    char[] charr = {'s','d','q','b','o'};
	    System.out.println(Arrays.toString(charr));
	    System.out.println(Arrays.binarySearch(charr,'o'));//정렬하지 않으면 결과가 제대로 안 나옴.
	    System.out.println();
	    
	    Arrays.sort(charr);//정렬
	    System.out.println(Arrays.toString(charr));
	    System.out.println(Arrays.binarySearch(charr,'o'));//정렬시켜야 제대로 결과가 나옴.
	    System.out.println();
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
