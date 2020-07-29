package Lesson_9;

//
//8. 
//�������� ���������� ����� MinMax, ������� �������� ������ ��� 
//���������� ������������ � ������������� �������� �������. 
//������ �������� ���������� ������. ������ ������ ������������ � ����� ����� �����������.

public class Task_1 {

	public static void main(String[] args) {
		Integer[] intArr = { 0, 1, 2, 3, 4, 5 };
		MinMax<Integer> intMinMax = new MinMax<>(intArr);
		System.out.println("Max �������� ��� Integer " + intMinMax.findMax());
		System.out.println("Min �������� ��� Integer " + intMinMax.findMin());
		
		Double[] doubleArray = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0 };
		MinMax<Double> dblMinMax = new MinMax<>(doubleArray);
		System.out.println("Max �������� ��� Double " + dblMinMax.findMax());
		System.out.println("Min �������� ��� Double " + dblMinMax.findMin());

		System.out.print("�������� �����? ");
		if (intMinMax.equals(dblMinMax)) {
			System.out.println("����������.");
		} else {
			System.out.println("������.");
		}
		}
}

//public class AverageDemo2 {
//	public static void main(String[] args) {
//		Integer[] intArray = { 1, 2, 3, 4, 5 };
//		Average2<Integer> iob = new Average2<>(intArray);
//		System.out.println("������� �������� ��� Integer " + iob.average());
//
//		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//		Average2<Double> dob = new Average2<>(doubleArray);
//		System.out.println("������� �������� ��� Double " + dob.average());
//
//		Float[] floatArray = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
//		Average2<Float> fob = new Average2<>(floatArray);
//		System.out.println("������� �������� ��� Float " + fob.average());
//
//		System.out.print("������� �������� ��� iob � dob ");
//		if (iob.sameAvg(dob)) {
//			System.out.println("����������.");
//		} else {
//			System.out.println("������.");
//		}
//
//		System.out.print("������� �������� ��� iob � fob ");
//		if (iob.sameAvg(fob)) {
//			System.out.println("����������.");
//		} else {
//			System.out.println("������.");
//		}
//	}
//}