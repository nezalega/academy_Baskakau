package Lesson_11;

import java.util.ArrayList;
import java.util.LinkedList;

//�������� �����, ������� ��������� 1000000 ��������� � ArrayList � LinkedList. 
//�������� ��� ���� �����, ������� �������� �� ������������ ������ ������� ������ 100000 ���. 
//�������� �����, ������� ��������� �� ���. �������� ���������� � ������������, ������ ��� ������ �����.

public class Task_2 {

public static void compare2Lists() {
    ArrayList<Double> arrayList = new ArrayList<>();
    LinkedList<Double> linkedList = new LinkedList<>();
    final int N = 1000000;
    final int M = 100000;
    for (int i = 0; i < N; i++) {
        arrayList.add(Math.random());
        linkedList.add(Math.random());
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < M; i++) {
        arrayList.get((int) (Math.random() * (N - 1)));
    }
    System.out.println(System.currentTimeMillis() - startTime + " For arrayList");

    startTime = System.currentTimeMillis();
    for (int i = 0; i < M; i++) {
        linkedList.get((int) (Math.random() * (N - 1)));
    }
    System.out.println(System.currentTimeMillis() - startTime + " For linkedList");
}

public static void main(String[] args) {
				
		compare2Lists();
		
}}