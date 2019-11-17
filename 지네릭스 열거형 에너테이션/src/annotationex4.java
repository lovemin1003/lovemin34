import java.util.Arrays;

class MyArrayList<T>
{
	T[] arr;
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList(T... arr)
	{
		this.arr = arr;
	}
	
	@SafeVarargs
	@SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a)
	{
		return new MyArrayList<>(a);
	}
	
	public String toString()
	{
		return Arrays.toString(arr);
	}
	
}
public class annotationex4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String> list = MyArrayList.asList("q","w","e");
		
		System.out.println(list);
	}

}
