package Lesson_14;
// �������� ������ ��������� ��� ���������� Printable, 
// ������� �������� ���� ����� void print().
public class Task_1 {

	public static void main(String[] args) {
		Printable prt = () -> System.out.println("Printed!");
		prt.print();
	}

}
