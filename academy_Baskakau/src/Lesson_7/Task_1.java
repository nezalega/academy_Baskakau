package Lesson_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {

			 
	    public static void main(String[] args) {
	 
	        String text = "������� �������?? �����... ��������, ����������, � ����������.!! ���������� ���������� ���������� ������ ���������� ��� ������� ��������� �������.";
	        int before = text.length();
	        int after = text.replaceAll("[,.!]", "").length();
	        System.out.println("���������� ������ ���������� � ������: " + (before - after));
	 
	        String[] arr = text.split("[!,.:?]"); // ������ �������
	        System.out.println("���������� ������ ���������� � ������ (2): " + arr.length);	        
	        
	        Pattern p = Pattern.compile ("[!,.:?]"); // ������ �������
	        Matcher m = p.matcher(text);
	        int counter = 0;
	        while (m.find()) {
	        	counter++;
	        }
	        System.out.println("���������� ������ ���������� � ������ (3): " + counter);
	    }
	}