package Lesson_10;

import java.util.LinkedList;

public class Task_3 {

	public static void main(String[] args) {
        
        LinkedList<String> states = new LinkedList<String>();
          
        // добавим в список ряд элементов
        states.add("Ирак");
        states.add("Germany");
        states.add("France");
        states.add("Бангладеш");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        System.out.println(states); 
        
        System.out.printf("List has %d elements \n", states.size());
        System.out.println("states.get(1) " + states.get(0));
        states.set(1, "Portugal");
        states.add(3, "Italy"); // добавляем элемент по индексу 3
        
        System.out.printf("List has %d elements \n", states.size());
        
        for(String state : states){
          
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){
          
            System.out.println("List contains Germany");
        }
          
        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
        
        System.out.println(states); 
        
//        LinkedList<Person> people = new LinkedList<Person>();
//        people.add(new Person("Mike"));
//        people.addFirst(new Person("Tom"));
//        people.addLast(new Person("Nick"));
//        people.remove(1); // удаление второго элемента
//          
//        for(Person p : people){
//          
//            System.out.println(p.getName());
//        }
//        Person first = people.getFirst();
//        System.out.println(first.getName()); // вывод первого элемента
//    }
//}
//class Person{
//      
//    private String name;
//    public Person(String value){
//          
//        name=value;
//    }
//    String getName(){return name;}
}}