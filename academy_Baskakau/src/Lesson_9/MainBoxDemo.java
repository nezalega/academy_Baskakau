package Lesson_9;

import java.util.Arrays;

public class MainBoxDemo {

	public static void main(String[] args) {
		BoxDemo <Integer> integer1 = new BoxDemo<>(10);
		System.out.println(integer1.getItem(5));
		
		integer1.add(2332);
		System.out.println(integer1.getItem(0));
		
		integer1.addToEnd(77);
		integer1.addToIndex(33, 11);
		System.out.println(Arrays.toString(integer1.getArray()));
	}
	
	
}
