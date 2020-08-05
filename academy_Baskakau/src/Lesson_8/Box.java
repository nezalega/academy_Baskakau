package Lesson_8;

public class Box <T> {

	private T items;
	
		public Box() {
		super();
	}
	
	public Box(T items) {
		super();
		this.items = items;
	}
	public T getItems() {
		
		return items;
	}
	public void setItem (T items ) {
		this.items = items;
	}
}
