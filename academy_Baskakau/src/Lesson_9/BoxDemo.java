package Lesson_9;

// 10-ая задача 

public class BoxDemo <T> {

	private T[] array;
	private int counter=0;
	
	@SuppressWarnings("unchecked")
	public BoxDemo(){
		super();
		array = (T[]) new Object[16];
		//private int counter=0;
	}
	@SuppressWarnings("unchecked")
	public BoxDemo(int size) {
		super();
		array = (T[]) new Object[size];
	}
	public T[] getArray() {
		return array;
	}
	public void setArray(T[] array) {
		this.array = array;
	}
	public T getItem(int index){
		if (index < array.length && index >= 0) {
		return array[index];
	} else {
		System.out.println("Errror");
		return null;
	}
}
	public void add(T item) {
		if (array==null) {
			return;
		}
		if (array.length == counter) {
		T[] temp = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, temp, 0, array.length); 
		array = temp;
		}
		array[counter++] = item;
	}
	
	public void addToEnd(T item) {

		if (array==null) {
			return;
		}
		array[array.length - 1] = item;
		counter = array.length;
	}
	public void addToIndex(T item, int index) {
		
		if (index < 0) {
			return;
		}
		if (index > array.length - 1) {
			T[] temp = (T[]) new Object[index + 1];
			System.arraycopy(array, 0, temp, 0, array.length); 
			array = temp;
		}
		array[index] = item;
		counter = index+1;
	}	
		}
	
	