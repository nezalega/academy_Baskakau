package Lesson_7;

public class Task_1 {

			 
	    public static void main(String[] args) {
	 
	        String text = "Доброго времени?? суток... Помогите, пожалуйста, с программой.!! Необходимо подсчитать количество знаков препинания вне главной диагонали матрицы.";
	        int before = text.length();
	        int after = text.replaceAll("[,.!]", "").length();
	        System.out.println("Количество знаков препинания в тексте: " + (before - after));
	 
	        String[] arr = text.split("[!,.:?]"); // второе решение
	        System.out.println("Количество знаков препинания в тексте (2): " + arr.length);	        
	        
	    }
	}