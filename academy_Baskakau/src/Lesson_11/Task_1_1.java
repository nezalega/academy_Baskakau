package Lesson_11;
//напишите метод, который на вход получает коллекцию обьектов, а возвращает коллекцию уже без дубликатов

import java.util.Scanner;

public class Task_1_1 {

	public static class OnlyDuplicates {
	   
		public static void main(String[] args)  {
	        System.out.print(" Enter a set of 10 numbers: ");
	        int[] numbers = new int[10];
	        Scanner input = new Scanner(System.in);
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextInt();
	        }
	        numbers = onlyDuplicates(numbers);
	        System.out.print(" The numbers are: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	    }

	    public static int[] onlyDuplicates(int[] list) {
	        boolean flag = true;
	        int[] array = new int[0];
	        array = add2Array(array, list[0]);
	        for (int i = 0; i < list.length; i++) {
	            for (int j = 0; j < array.length; j++) {
	                if (list[i] == array[j]) {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag) {
	                array = add2Array(array, list[i]);
	            }
	            flag = true;
	        }
	        return array;
	    }
	    // Copy numbers1 to numbers2
	    // If the length of numbers2 is less then numbers2, return false
	    public static boolean copyArray(int[] source, int[] dest) {
	        if (source.length > dest.length) {
	            return false;
	        }

	        for (int i = 0; i < source.length; i++) {
	            dest[i] = source[i];
	        }
	        return true;
	    }
	    // Increase array size by one and add integer to the end of the array
	    public static int[] add2Array(int[] source, int data) {
	        int[] dest = new int[source.length + 1];
	        copyArray(source, dest);
	        dest[source.length] = data;
	        return dest;
	    }
	}}