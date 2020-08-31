package Lesson_13;

import java.lang.reflect.Field;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		
		Cat myClass = new Cat();
		   int number = myClass.getLegs();
		   String nose = null; //myClass.getNose(); //no getter =(
		 int lifes = myClass.getLifes();
		   //  printData(myClass); // outout 0default
		    System.out.println(number + " " + nose + " " + lifes);//output 0null
		   try {
		       Field field = myClass.getClass().getDeclaredField("nose");
		       field.setAccessible(true);
		       nose = (String) field.get(myClass);
		     
		   } catch (NoSuchFieldException | IllegalAccessException e) {
		       e.printStackTrace();
		   }
		 //  printData(myClass);
		   System.out.println(number + nose);//output 0default
		}

	private static void printData(Cat myClass) {
		// TODO Auto-generated method stub
		
	}
		
	}