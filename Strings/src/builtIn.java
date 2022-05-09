/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class builtIn {

	/**
	 * @param args
	 * string s
	 * char c
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = " KITTUR rani CHENNAMMA ";
     System.out.println("The main string is : " +s);
     
     String res1 = s.toUpperCase();
     System.out.println("UPPER CASE RESULT : " +res1);
     
     String res2 = s.toLowerCase();
     System.out.println("LOWER CASE RESULT : " +res2);
     
     boolean res3 = s.startsWith("KITTUR");
     System.out.println("STARTSWITH RESULT : "+res3);
     boolean res4 = s.startsWith("rani");
     System.out.println("STARTSWITH RESULT : "+res4);
     
     boolean res5 = s.endsWith("CHENNAMMA");
     System.out.println("ENDSWITH RESULT : " +res5);
     boolean res6 = s.endsWith("rani");
     System.out.println("ENDSWITH RESULT : " +res6);
     
     boolean res7 = s.contains("rani");
     System.out.println("CONTAINS RESULT : " +res7);
	
     char res8 = s.charAt(7);
     System.out.println("CHARACTER AT : " +res8);
     
     int res9 = s.length();
     System.out.println("LENGTH OF STRING : " +res9);
     
     int res10 = s.indexOf("r");
     System.out.println("INDEX OF r: " +res10);
     
     String res11 = s.concat(" KARNATAKA");
     System.out.println("CONCAT RESULT : " +res11);
     
     System.out.println(s.getClass());
     
     System.out.println(s.isBlank());
     System.out.println(s.isEmpty());
     String s1 = "";
     System.out.println(s1.isBlank());
     System.out.println(s1.isEmpty());
     
     System.out.println(s.lastIndexOf("M"));
     System.out.println(s.lastIndexOf("CHE"));
     System.out.println(s.lastIndexOf('A' , 23));
     
     System.out.println(s.replace('r', 'R'));//rani to Rani
     
     System.out.println(s.replace("rani","raja"));// KITTUR raja CHENNAMMA
     
     System.out.println(s.strip());
     System.out.println(s.stripLeading());
     System.out.println(s.stripTrailing());
     
     System.out.println(s.trim());
     
     System.out.println(s.toString());
     
     char[] c = s.toCharArray();
     for(int i=0; i<c.length; i++) {
    	 System.out.println(c[i]+"-");
    	 
     }
     
	}
	
}
