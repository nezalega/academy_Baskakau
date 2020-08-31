package Lesson_13;

public class Cat {

	public String nose = "Red";
	protected int legs = 4;
	private int lifes = 77;
	
	
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLifes() {
		return lifes;
	}
	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
	
	public void helloCat(){
        
        System.out.println("Cat");
    }
    protected void welcomeCat(){
         
        System.out.println("Welcome Cat");
    }
    private void byeCat(){
        
        System.out.println("Bye Cat");
	}
    
    Class clazzCat = Integer.class;
}
