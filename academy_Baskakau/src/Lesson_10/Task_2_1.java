package Lesson_10;

import java.util.Arrays;
import java.util.Random;

public class Task_2_1 {

	public static void main(String[] args) {
	    int arrayLength = 10;
	    int[] array = new int[arrayLength];
	    //filling array
	    for (int i = 0; i < array.length; i++) {
	        array[i] = i;
	    }
	 
	    //copy array
	    int[] tmpArray = Arrays.copyOf(array, array.length);
	    Random r = new Random();
	    int counter = 0;//counter of printed values
	    while (counter < tmpArray.length) {//while not all values printed
	        int i = r.nextInt(tmpArray.length);//next random index of tmpArray
	        int value = tmpArray[i];//value at this index
	        if (value != -1) {//if value not printed
	            System.out.println(value);
	            tmpArray[i] = -1;//mark printed value
	            counter++;//increase counter
	        }
	    }
	}}