/**
 * 
 */
package mutable;

/**
 * @author Shalini
 *
 */
public class buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Ramayana");
	      
	      System.out.println(sb.capacity());
	      sb.ensureCapacity(70);
	      System.out.println(sb.capacity());
	      
	      System.out.println(sb.charAt(5));
	      
	      
	      
	      StringBuffer sb1 = new StringBuffer("mahabharat");
	      StringBuffer sb2 = new StringBuffer("");
	      
	      System.out.println(sb.compareTo(sb1));
	      
	      System.out.println(sb.equals(sb2));
	      
	      System.out.println(sb1.deleteCharAt(8));
	      
	      System.out.println(sb1.delete(3,6));
	      
	      System.out.println(sb.getClass());
	      
	      System.out.println(sb.indexOf("a"));
	      
	      System.out.println(sb2.isEmpty());
	      
	      System.out.println(sb.lastIndexOf("y"));
	      
	      System.out.println(sb1.length());
	      
	      System.out.println(sb2.replace(0, 5, "'s sita"));
	      
	      System.out.println(sb2.reverse());
	      
	      sb2.setCharAt(3, 's');
	      System.out.println(sb2);
	      
	      System.out.println(sb2.reverse());
	      
	      System.out.println(sb2.length());
	      sb2.setLength(10);
	      System.out.println(sb2.length());
	      
	      System.out.println(sb1.substring(4));
	      
	      System.out.println(sb);
	      System.out.println(sb2);
	      
	      sb.append(sb2);
	      System.out.println(sb);
	      
	      
	}

}
