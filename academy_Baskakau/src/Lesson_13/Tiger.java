package Lesson_13;

public class Tiger extends Cat {

	public String tale = "Short";
	protected int mouth = 1;
	private int years = 35;
	
	public String getTale() {
		return tale;
	}
	public void setTale(String tale) {
		this.tale = tale;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public void helloTiger(){
        
        System.out.println("Tiger");
    }
    protected void welcomeTiger(){
         
        System.out.println("Welcome Tiger");
    }
    private void byeTiger(){
        
        System.out.println("Bye Tiger");
	}
    Class clazzTiger = Integer.class;
}
