package Lesson_15;

	
	class NewThread implements Runnable {
	      
	       public NewThread() {
	            
	       }
	       @Override
	       public void run() {

	             System.out.println("���� ������ run(), ���������� ������.");
	    	   for (int i = 1; i <=100; i++) {
					System.out.println("A: " + i);
				}
			}
	       }
	

	public class Task_1 {

	       public static void main(String args[]) {
	             
	    	   System.out.println("�������� �����.");
	             Runnable r = new NewThread();
	             Thread t = new Thread(r);
	
	             t.start();
	       }
	}