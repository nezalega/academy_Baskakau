package Lesson_6;

import java.util.Scanner;

public class String_s {
    public static void main(String[] args) {
    	
    	Scanner Vvod = new Scanner(System.in);
        String b = Vvod.next();
    	
    	String b1 = null;
        int    max = 0;
        
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > max) {
                max = args[i].length();
                b1 = args[i];
            }
        }
        System.out.println("Length: " + max + " String: " + b1);
    }  
}