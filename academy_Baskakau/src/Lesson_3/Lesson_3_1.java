package Lesson_3;

import java.util.Random;

public class Lesson_3_1 {

	public static void main(String[] args) {

		double sum = 0;
		int size = 5;
		double SrAr;
		
		
		int[] array = new int[size]; // ������ �������
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); // ��� �������� ��� �������
		}
		System.out.println("��������� ������:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		for (int num : array) { // ����� ���� ����� ���������� �������
			sum = sum + num;
		}
		System.out.println();
		System.out.println("����� ����� �������: " + sum);
		
		SrAr = sum/size;
		
		System.out.println("C������ ��������������: " + SrAr);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<SrAr) {
			System.out.println("������� ��������  " + array[i]);
						
			}
		}
		}}
	
		

