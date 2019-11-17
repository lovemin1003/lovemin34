<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class MyVectors implements List {


		
		Object[] data =null; //객체를 담기 위한 객체 배열을 선언한다.
		int capacity=0; //용량
		int size=0; //크기
		
		public MyVectors (int capacity)
		{
			if(capacity<0)
			{
				throw new IllegalArgumentException("유효하지 않은 값:"+capacity);
			}
			
			this.capacity=capacity;
			data = new Object[capacity];
				
		}
		
		public MyVectors()
		{
			this(10);//크기를 지정하지 않으면 크기를 10으로 함.
		}
		
		//최소한의 저장공간을 확보하는 메소드
		public void ensureCapacity(int minCapacity)
		{
			if(minCapacity - data.length > 0)
			{
				setCapacity(minCapacity);
			}
		}
		

		public boolean add(Object obj) {
			//새 객체를 저장하기 전에 저장할 공간을 확보한다.
			ensureCapacity(size+1);
			data[size++] = obj;
			return true;
		}
		

		public Object get(int index) {
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			return data[index];
		}
		

		public Object remove(int index) {
			
			Object oldObj = null;
			
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			
			oldObj = data[index];
			
			//삭제하고자 하는 객체가 마지막 객체가 아니면, 배열 복사로 빈 자리를 채워줘야 한다.
			if(index != size-1)
			{
				System.arraycopy(data, index+1, data, index, size-index-1);
			}
			//마지막 데이터를 null로 한다. 배열은 0부터 시작하므로 마지막 요소는 index가 size-1이다.
			data[size-1] = null;
			size--;
			return oldObj;
		}
		

		public boolean remove(Object obj) {
			
			for(int i=0; i<size; i++)
			{
				if(obj.equals(data[i]))
				{
					remove(i);
					return true;
				}
			}
			
			return false;
		}
		
		public void trimToSize()
		{
			setCapacity(size);
		}

	

	private void setCapacity(int minCapacity) {
			if(this.capacity==capacity)
			{
				return; //크기가 같으면 변경되지 않음.
			}
			Object[] tmp = new Object[capacity];
	        System.arraycopy(data, 0, tmp,0, size);
	        data = tmp;
	        this.capacity=capacity;
	}


	public void clear() {
		for(int i=0; i<size; i++)
		{
			data[i] = null;
			size=0;
		}
		
	}

	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	
	public boolean isEmpty() {
		
		return  size==0;
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public int capacity() {
		// TODO Auto-generated method stub
		return capacity;
	}
	
	
	//List 인터페이스에서 상속받은 메소드들
	
	

	
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	



	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
=======
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class MyVectors implements List {


		
		Object[] data =null; //객체를 담기 위한 객체 배열을 선언한다.
		int capacity=0; //용량
		int size=0; //크기
		
		public MyVectors (int capacity)
		{
			if(capacity<0)
			{
				throw new IllegalArgumentException("유효하지 않은 값:"+capacity);
			}
			
			this.capacity=capacity;
			data = new Object[capacity];
				
		}
		
		public MyVectors()
		{
			this(10);//크기를 지정하지 않으면 크기를 10으로 함.
		}
		
		//최소한의 저장공간을 확보하는 메소드
		public void ensureCapacity(int minCapacity)
		{
			if(minCapacity - data.length > 0)
			{
				setCapacity(minCapacity);
			}
		}
		

		public boolean add(Object obj) {
			//새 객체를 저장하기 전에 저장할 공간을 확보한다.
			ensureCapacity(size+1);
			data[size++] = obj;
			return true;
		}
		

		public Object get(int index) {
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			return data[index];
		}
		

		public Object remove(int index) {
			
			Object oldObj = null;
			
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			
			oldObj = data[index];
			
			//삭제하고자 하는 객체가 마지막 객체가 아니면, 배열 복사로 빈 자리를 채워줘야 한다.
			if(index != size-1)
			{
				System.arraycopy(data, index+1, data, index, size-index-1);
			}
			//마지막 데이터를 null로 한다. 배열은 0부터 시작하므로 마지막 요소는 index가 size-1이다.
			data[size-1] = null;
			size--;
			return oldObj;
		}
		

		public boolean remove(Object obj) {
			
			for(int i=0; i<size; i++)
			{
				if(obj.equals(data[i]))
				{
					remove(i);
					return true;
				}
			}
			
			return false;
		}
		
		public void trimToSize()
		{
			setCapacity(size);
		}

	

	private void setCapacity(int minCapacity) {
			if(this.capacity==capacity)
			{
				return; //크기가 같으면 변경되지 않음.
			}
			Object[] tmp = new Object[capacity];
	        System.arraycopy(data, 0, tmp,0, size);
	        data = tmp;
	        this.capacity=capacity;
	}


	public void clear() {
		for(int i=0; i<size; i++)
		{
			data[i] = null;
			size=0;
		}
		
	}

	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	
	public boolean isEmpty() {
		
		return  size==0;
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public int capacity() {
		// TODO Auto-generated method stub
		return capacity;
	}
	
	
	//List 인터페이스에서 상속받은 메소드들
	
	

	
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	



	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
=======
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class MyVectors implements List {


		
		Object[] data =null; //객체를 담기 위한 객체 배열을 선언한다.
		int capacity=0; //용량
		int size=0; //크기
		
		public MyVectors (int capacity)
		{
			if(capacity<0)
			{
				throw new IllegalArgumentException("유효하지 않은 값:"+capacity);
			}
			
			this.capacity=capacity;
			data = new Object[capacity];
				
		}
		
		public MyVectors()
		{
			this(10);//크기를 지정하지 않으면 크기를 10으로 함.
		}
		
		//최소한의 저장공간을 확보하는 메소드
		public void ensureCapacity(int minCapacity)
		{
			if(minCapacity - data.length > 0)
			{
				setCapacity(minCapacity);
			}
		}
		

		public boolean add(Object obj) {
			//새 객체를 저장하기 전에 저장할 공간을 확보한다.
			ensureCapacity(size+1);
			data[size++] = obj;
			return true;
		}
		

		public Object get(int index) {
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			return data[index];
		}
		

		public Object remove(int index) {
			
			Object oldObj = null;
			
			if(index <0 || index >=size)
			{
				throw new IndexOutOfBoundsException("범위를 벗어남.");
			}
			
			oldObj = data[index];
			
			//삭제하고자 하는 객체가 마지막 객체가 아니면, 배열 복사로 빈 자리를 채워줘야 한다.
			if(index != size-1)
			{
				System.arraycopy(data, index+1, data, index, size-index-1);
			}
			//마지막 데이터를 null로 한다. 배열은 0부터 시작하므로 마지막 요소는 index가 size-1이다.
			data[size-1] = null;
			size--;
			return oldObj;
		}
		

		public boolean remove(Object obj) {
			
			for(int i=0; i<size; i++)
			{
				if(obj.equals(data[i]))
				{
					remove(i);
					return true;
				}
			}
			
			return false;
		}
		
		public void trimToSize()
		{
			setCapacity(size);
		}

	

	private void setCapacity(int minCapacity) {
			if(this.capacity==capacity)
			{
				return; //크기가 같으면 변경되지 않음.
			}
			Object[] tmp = new Object[capacity];
	        System.arraycopy(data, 0, tmp,0, size);
	        data = tmp;
	        this.capacity=capacity;
	}


	public void clear() {
		for(int i=0; i<size; i++)
		{
			data[i] = null;
			size=0;
		}
		
	}

	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	
	public boolean isEmpty() {
		
		return  size==0;
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public int capacity() {
		// TODO Auto-generated method stub
		return capacity;
	}
	
	
	//List 인터페이스에서 상속받은 메소드들
	
	

	
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	



	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
>>>>>>> parent of f46b05c... Revert "자바 공부한 것-2(javaで勉強した事　その2） "
