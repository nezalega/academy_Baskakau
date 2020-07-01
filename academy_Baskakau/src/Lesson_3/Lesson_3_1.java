package Lesson_3;

import java.util.Random;

public class Lesson_3_1 {

	public static void main(String[] args) {

		double sum = 0;
		int size = 5;
		double SrAr;
		
		
		int[] array = new int[size]; // размер массива
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); // пул значений для рандома
		}
		System.out.println("Рандомный массив:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		for (int num : array) { // сумма всех чисел рандомного массива
			sum = sum + num;
		}
		System.out.println();
		System.out.println("Сумма чисел массива: " + sum);
		
		SrAr = sum/size;
		
		System.out.println("Cреднее арифметическое: " + SrAr);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<SrAr) {
			System.out.println("Меньшее значение  " + array[i]);
						
			}
		}
		}}
	
		

