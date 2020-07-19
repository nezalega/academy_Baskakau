package Lesson_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {

			 
	    public static void main(String[] args) {
	 
	        String text = "Доброго времени?? суток... Помогите, пожалуйста, с программой.!! Необходимо подсчитать количество знаков препинания вне главной диагонали матрицы.";
	        int before = text.length();
	        int after = text.replaceAll("[,.!]", "").length();
	        System.out.println("Количество знаков препинания в тексте: " + (before - after));
	 
	        String[] arr = text.split("[!,.:?]"); // второе решение
	        System.out.println("Количество знаков препинания в тексте (2): " + arr.length);	        
	        
	        Pattern p = Pattern.compile ("[!,.:?]"); // третье решение
	        Matcher m = p.matcher(text);
	        int counter = 0;
	        while (m.find()) {
	        	counter++;
	        }
	        System.out.println("Количество знаков препинания в тексте (3): " + counter);
	    }
	}