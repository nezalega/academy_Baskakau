package Lesson_9;

//
//8. 
//Ќаписать обобщенный класс MinMax, который содержит методы дл€ 
//нахождени€ минимального и максимального элемента массива. 
//ћассив €вл€етс€ переменной класса. ћассив должен передаватьс€ в класс через конструктор.

public class Task_1 {

	public static void main(String[] args) {
		Integer[] intArr = { 0, 1, 2, 3, 4, 5 };
		MinMax<Integer> intMinMax = new MinMax<>(intArr);
		System.out.println("Max значени€ дл€ Integer " + intMinMax.findMax());
		System.out.println("Min значени€ дл€ Integer " + intMinMax.findMin());
		
		Double[] doubleArray = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0 };
		MinMax<Double> dblMinMax = new MinMax<>(doubleArray);
		System.out.println("Max значени€ дл€ Double " + dblMinMax.findMax());
		System.out.println("Min значени€ дл€ Double " + dblMinMax.findMin());

		System.out.print("«начени€ равны? ");
		if (intMinMax.equals(dblMinMax)) {
			System.out.println("одинаковые.");
		} else {
			System.out.println("разные.");
		}
		}
}

//public class AverageDemo2 {
//	public static void main(String[] args) {
//		Integer[] intArray = { 1, 2, 3, 4, 5 };
//		Average2<Integer> iob = new Average2<>(intArray);
//		System.out.println("—реднее значени€ дл€ Integer " + iob.average());
//
//		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//		Average2<Double> dob = new Average2<>(doubleArray);
//		System.out.println("—реднее значени€ дл€ Double " + dob.average());
//
//		Float[] floatArray = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
//		Average2<Float> fob = new Average2<>(floatArray);
//		System.out.println("—реднее значени€ дл€ Float " + fob.average());
//
//		System.out.print("—редние значени€ дл€ iob и dob ");
//		if (iob.sameAvg(dob)) {
//			System.out.println("одинаковые.");
//		} else {
//			System.out.println("разные.");
//		}
//
//		System.out.print("—редние значени€ дл€ iob и fob ");
//		if (iob.sameAvg(fob)) {
//			System.out.println("одинаковые.");
//		} else {
//			System.out.println("разные.");
//		}
//	}
//}