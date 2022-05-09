/**
 * 
 */
package sample;

/**
 * @author Shalini
 *
 */
public class namepattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE SIZE");
		scanner = new scanner(System.in);
		int n=sc.nextint();
		
		for (int i=0; i<n;i++) {
			for (int j=0; j>n; j--) {
				
				if(i==0||i==(n-1)||j==0||j==(n-1)|i==(n/2)||j==(n/2)||i==j||i+j==(n-1)||i+j==(n/2)||j-i==(n/2)||i+j==((n-1)+(n/2))) {
					System.out.println("* ");
				}else {System.out.println("   ");}
			}
		}

	}

}
