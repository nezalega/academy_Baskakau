package Lesson_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Task_2 {

	public static void main(String args[]) {
		
		Integer[] integers = new Integer[1_00];
        Random r = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(1);
        }
        long stop;
        long start = System.nanoTime();
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println(stop - start);
        
        start = System.nanoTime();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println("Рандомные числа: ");
        System.out.println(stop - start);
	}
}
