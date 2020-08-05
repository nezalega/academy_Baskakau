package Lesson_8;

public class Main {

	public static void main (String [] args) {
		
		Box<A> boxa = new Box<A>();
		boxa.setItem(new A(25,"Hleb"));
		
		Box<B> boxb = new Box<B>();
		boxb.setItem(new B(25,35));
		
		
		System.out.println(boxb.getItem());
	}
	
}
