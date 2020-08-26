package Lesson_14;

import java.util.HashMap;
import java.util.Map;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Map<String, CalculatorFunction> catalog = new HashMap<>();
		catalog.put("+", (d,c)->d+c);
		catalog.put("-", (d,c)->d-c);
		catalog.put("*", (d,c)->d*c);
		catalog.put("/", (d,c)->d/c);
		
		System.out.println(catalog.get("+").calk(2, 3));
		System.out.println(catalog.get("/").calk(10, 5));
		System.out.println(catalog.get("*").calk(10, 3));
		System.out.println(catalog.get("-").calk(90, 33));
	}

}
