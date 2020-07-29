package Lesson_10;

import java.util.LinkedList;

public class Task_3 {

	public static void main(String[] args) {
        
        LinkedList<String> states = new LinkedList<String>();
          
        // ������� � ������ ��� ���������
        states.add("����");
        states.add("Germany");
        states.add("France");
        states.add("���������");
        states.addLast("Great Britain"); // ��������� �� ��������� �����
        states.addFirst("Spain"); // ��������� �� ������ �����
        System.out.println(states); 
        
        System.out.printf("List has %d elements \n", states.size());
        System.out.println("states.get(1) " + states.get(0));
        states.set(1, "Portugal");
        states.add(3, "Italy"); // ��������� ������� �� ������� 3
        
        System.out.printf("List has %d elements \n", states.size());
        
        for(String state : states){
          
            System.out.println(state);
        }
        // �������� �� ������� �������� � ������
        if(states.contains("Germany")){
          
            System.out.println("List contains Germany");
        }
          
        states.remove("Germany");
        states.removeFirst(); // �������� ������� ��������
        states.removeLast(); // �������� ���������� ��������
        
        System.out.println(states); 
        
//        LinkedList<Person> people = new LinkedList<Person>();
//        people.add(new Person("Mike"));
//        people.addFirst(new Person("Tom"));
//        people.addLast(new Person("Nick"));
//        people.remove(1); // �������� ������� ��������
//          
//        for(Person p : people){
//          
//            System.out.println(p.getName());
//        }
//        Person first = people.getFirst();
//        System.out.println(first.getName()); // ����� ������� ��������
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