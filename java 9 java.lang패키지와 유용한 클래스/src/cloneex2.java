import java.util.Arrays;

public class cloneex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int[] arrclone = arr.clone();
		arrclone[0] = 6; // 배열 arr를 복제해서 같은 내용의 새 배열을 만든다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrclone));

	}

}
