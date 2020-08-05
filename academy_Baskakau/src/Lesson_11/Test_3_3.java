package Lesson_11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test_3_3 {
	
		 
	    private static <T> Iterator<T> getIterator(final T[] array) {
	        return new Iterator<T>() {
	            private int count = array.length;
	            private int index = 0;
	            @Override
	            public boolean hasNext() {
	                return index < count;
	            }
	 
	            @Override
	            public T next() {
	                if (index < count) {
	                    return array[index++];
	                } else {
	                    throw new NoSuchElementException("No such element.");
	                }
	            }
	 
	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException("Cannot remove item from array.");
	            }
	        };
	    }
	 
	    public static void main(String[] args) {
	        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5, 5, 23, 56, 79, 100};
	        Double[] doubles = new Double[]{0.1, 0.2, 0.3};
	 
	        Iterator<Integer> integerIterator = getIterator(integers);
	 
	        while (integerIterator.hasNext()) {
	            System.out.print(integerIterator.next());
	        }
	        System.out.println("");
	        Iterator<Double> doubleIterator = getIterator(doubles);
	        while (doubleIterator.hasNext()) {
	            System.out.println(doubleIterator.next());
	            
	        }
	 
	    }
	}