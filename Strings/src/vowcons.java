import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class vowcons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE STRING");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int v =0;
int n =0;
s = s.toLowerCase();
for(int i=0; i<s.length(); i++) {
	char c = s.charAt(i) ;
	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		v=v+1;
	}
	else n=n+1;
}
System.out.println("LENGTH OF GIVEN STRING : "+s.length());
System.out.println("No. OF VOWELS : "+v);
System.out.println("No. OF CONSONENTS : "+n);
	}

}
