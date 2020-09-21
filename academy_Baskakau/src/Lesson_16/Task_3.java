package Lesson_16;



class NewThread1 implements Runnable {
    
    public NewThread1() {
         
    }
    @Override
    public void run() {

          System.out.println("Тело метода run(), созданного потока.");
 	   for (int i = 1; i <=100; i++) {
 		  if (i % 10 == 0)
				System.out.println("B: " + i);
 		 try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			}
		}
    }


public class Task_3 {

    public static void main(String args[]) {
          
 	   System.out.println("Основной поток.");
          Runnable r = new NewThread1();
          Thread t = new Thread(r);
          
		/*
		 * (int i = 1; i<100; i++){ System.out.println ("Z" + i);
		 * 
		 * }
		 */
          Thread d = new Thread(r);
          Thread w = new Thread(r);

          t.start();
          d.start();
          w.start();
    }
}