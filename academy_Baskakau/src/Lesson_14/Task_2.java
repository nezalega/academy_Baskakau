package Lesson_14;

//������� ������ ���������, ������� ���������� �������� true, 
//���� ������ �� null, ��������� �������������� ��������� Predicate.

public class Task_2 {

	public static void main(String[] args) { 
		   Predicate <String> isEvenNumber = x-> x != null;
		   Predicate <String> isNumber = x-> !x.isEmpty();
		   
		   Predicate <Integer> isInt = x -> x != 0; 

		   System.out.println(isEvenNumber.test("6"));
		   System.out.println(isNumber.test(""));
		   System.out.println(isEvenNumber.test("gf"));
		   
		   System.out.println("For isInt " + isInt.test(0));
		   
		}
}
