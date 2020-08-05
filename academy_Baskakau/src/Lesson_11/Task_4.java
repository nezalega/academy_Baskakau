package Lesson_11;

//Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable. Отсортировать по весу.
//Распечатать содержимое с помощью for each. 
//class HeavyBox  {
//    int weight; 
//    
//    HeavyBox(int w, int h, int d, int m) {
//        width = w;
//        height = h;
//        depth = d;
//        weight = m; 
//    }
//}

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


	public class Task_4 {
	


		public static void main(String[] args) {

			Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return -o1.compareTo(o2);
				}
			});

			treeSet.add(1);
			treeSet.add(123);
			treeSet.add(432);
			treeSet.add(12);
			treeSet.add(32);
			treeSet.add(12);
			treeSet.add(32);
			treeSet.add(12);
			treeSet.add(32);

			System.out.println(treeSet);

			Integer weight_a = 3;
			Integer weight_b = 9;

			System.out.println(weight_a.compareTo(weight_b));
			System.out.println(weight_b.compareTo(weight_a));
			System.out.println(weight_b.compareTo(weight_b));

			Set<String> s = new TreeSet<>();

			s.add("z");
			s.add("Z");

			s.add("харьков");
			s.add("Харьков");
			s.add("Киев");
			s.add("Львов");
			s.add("Кременчуг");
			s.add("Харьков");

			System.out.println(s);

		}
	}

