package Lesson_13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintData {
	public static void printData(Object myClass){
		   try {
		       Method method = myClass.getClass().getDeclaredMethod("printData");
		       method.setAccessible(true);
		       method.invoke(myClass);
		   } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
		       e.printStackTrace();
		   }
		}
}
