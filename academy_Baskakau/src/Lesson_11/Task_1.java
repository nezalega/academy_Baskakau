package Lesson_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// напишите метод, который на вход получает коллекцию обьектов, а возвращает коллекцию уже без дубликатов

public class Task_1 {

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);

	}

	public static void main(String[] args) {

		List<String> coll = new ArrayList<String>(10);
		coll.add("F");
		System.out.println(removeDuplicates(coll));
	}

}
