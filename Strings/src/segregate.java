import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class segregate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = "";
		String s3 = "";
		
		for(int i=0; i<s1.length(); i++) {
			if ((s1.charAt(i)>=65) && (s1.charAt(i)<=90) || (s1.charAt(i)>=97) 
				&& (s1.charAt(i)<=122) || (s1.charAt(i)>=48) && (s1.charAt(i)<=57)) {
			
			s2 = s2+s1.charAt(i);
			}
			else {
				s3 = s3+s1.charAt(i);
			}
			
	}
		System.out.println(s2);
		System.out.println(s3);

}
}