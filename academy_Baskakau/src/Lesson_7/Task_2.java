package Lesson_7;

import java.util.Scanner;

public class Task_2 {
			 
	        public static void main(String[] args) {
	 
	            Scanner sc = new Scanner(System.in);
	            //������ ����������� � �������
	            System.out.println("������� ����� ����� ������� ����� ������");
	            String input = sc.nextLine();
	            //��������� ���������� ���� ����� 0
	            int count = 0;
	 
	            //���� ����� ���� �� ���� �����, ����� �������, ����� ����� ���������
	            if(input.length() != 0){
	                count++;
	                //��������� ������ ������, �� ������ �� ���
	                for (int i = 0; i < input.length(); i++) {
	                    if(input.charAt(i) == ' '){
	                  //      ���� ������ - ����������� ���������� ���� �� 1
	                        count++;
	                    }
	                }
	             System.out.println("�� ����� "+count+" ����");
	        }
	}}