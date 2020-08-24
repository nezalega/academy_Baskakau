package Lesson_14;
// Написать лямбда выражение для интерфейса Printable, 
// который содержит один метод void print().
public class Task_1 {

	public static void main(String[] args) {
		Printable prt = () -> System.out.println("Printed!");
		prt.print();
	}

}
