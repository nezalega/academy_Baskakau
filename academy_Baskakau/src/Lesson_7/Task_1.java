package Lesson_7;

public class Task_1 {

			 
	    public static void main(String[] args) {
	 
	        String text = "������� �������?? �����... ��������, ����������, � ����������.!! ���������� ���������� ���������� ������ ���������� ��� ������� ��������� �������.";
	        int before = text.length();
	        int after = text.replaceAll("[,.!]", "").length();
	        System.out.println("���������� ������ ���������� � ������: " + (before - after));
	 
	        String[] arr = text.split("[!,.:?]"); // ������ �������
	        System.out.println("���������� ������ ���������� � ������ (2): " + arr.length);	        
	        
	    }
	}