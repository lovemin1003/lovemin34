import java.util.Arrays;

public class cloneex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int[] arrclone = arr.clone();
		arrclone[0] = 6; // �迭 arr�� �����ؼ� ���� ������ �� �迭�� �����.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrclone));

	}

}
