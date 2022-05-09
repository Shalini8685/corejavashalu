import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class lower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] c = s.toCharArray();
		
		for(int i=0;i<s.length(); i++) {
			
			if(c[i]>=65 && c[i]<=90) {
				c[i] = (char)(c[i]+32);
			}
			else if(c[i]>=97 && c[i]<=122) {
				c[i]=(char)(c[i]-32);
			}
		}
		for (int i=0;i<s.length();i++) {
		System.out.print(c[i]);
	}
}
}
