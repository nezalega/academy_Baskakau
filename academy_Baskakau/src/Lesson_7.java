import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_7 {

	public static void main (String [] args) {
		
		String [] tests = {"12/05/1953", "00/00/0000", "13/12/2020", "13-05-1954"};
		String [] tests2 = {"50-50-9999", "00-00-0000", "13-10-2020", "13-05-1954"};
		
		//a
		Pattern p1 = Pattern.compile ("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0]?[1-9]|1[0-2])/\\d{4}");
		//b
		Pattern p2 = Pattern.compile ("([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}");
		
		for (String t : tests) {
			Matcher m1 = p1.matcher(t);
			
			
			if (m1.find()) {
				System.out.println(m1.group(0));
//			} else if (m2.find()) {
//				System.out.println(m2.group(0));
			}
			else {
				System.out.println("False");
			}
			
			for (String t2 : tests2) {
				Matcher m2 = p2.matcher(t2);
							
				if (m2.find()) {
					System.out.println(m2.group(0));
		}
				else {
					System.out.println("False2");
	}
	
	
}}}}
