import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class changevc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//s = s.toUpperCase();
		s = s.replace('a','1');
		s = s.replace('e','2');
		s = s.replace('i','3');
		s = s.replace('o','4');
		s = s.replace('u','5');
		
		s = s.replace('A','1');
		s = s.replace('E','2');
		s = s.replace('I','3');
		s = s.replace('O','4');
		s = s.replace('U','5');
	
System.out.println(s);
}
}
