/**
 * 
 */
package mutable;

/**
 * @author Shalini
 *
 */
public class builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuilder sb = new StringBuilder("Ramayana");
      
      System.out.println(sb.capacity());
      sb.ensureCapacity(70);
      System.out.println(sb.capacity());
      
      System.out.println(sb.charAt(5));
      
      
      
      StringBuilder sb1 = new StringBuilder("mahabharat");
      StringBuilder sb2 = new StringBuilder(" ramayana");
      
      System.out.println(sb.compareTo(sb1));
      
      System.out.println(sb.equals(sb2));
      
      System.out.println(sb1.deleteCharAt(8));
      
      System.out.println(sb1.delete(3,6));
      
      System.out.println(sb.getClass());
      
      System.out.println(sb.indexOf("y"));
      
      System.out.println(sb2.isEmpty());
      
      System.out.println(sb.lastIndexOf("a"));
      
      System.out.println(sb2.length());
      
      System.out.println(sb2.replace(0, 4, " sita"));
      
      System.out.println(sb.reverse());
      
      sb1.setCharAt(4, 's');
      System.out.println(sb1);
      
      System.out.println(sb2.length());
      sb2.setLength(10);
      System.out.println(sb2.length());
      
      System.out.println(sb2.substring(4));
      
      System.out.println(sb.reverse());
      
      System.out.println(sb);
      System.out.println(sb2);
      
      sb.append(  sb2);
      System.out.println(sb);
      
	}

}
