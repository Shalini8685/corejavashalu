import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      String s1 = sc.next();
	      String s2 ="";
	       for (int i=(s1.length()-1); i>=0; i--){
	    	   s2 = s2 + (s1.charAt(i));
	       }
	       System.out.println(s2);
	       if(s1.equals(s2)==true) {
	    	   System.out.println("PALINDROME");
	       }
	       else {
	    	   System.out.println("NOT A PALINDROME");
	       }

	}

}
