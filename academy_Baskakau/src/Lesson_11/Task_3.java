package Lesson_11;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Написать итератор по массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//Протестировать в main.


public class Task_3 {

	class ArrayIterator<T> implements Iterator<T>{

	    private T[] array;
	    private int index = 0;

	    public ArrayIterator(T[] array) {
	        this.array = array;
	    }

	    @Override
	    public boolean hasNext() {
	        return index < array.length;
	    }

	    @Override
	    public T next() {
	        if(!hasNext())
	            throw new NoSuchElementException();
	        return array[index++];
	    }
	}
	
	public static void main(String[] args) {
		
	//	System.out.println(ArrayIterator(T[] array));
	}

}