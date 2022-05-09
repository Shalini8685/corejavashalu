/**
 * @author Shalini
 *
 */
class brain{
	int Iq;
	float weight;
	
	public brain(int iq, float weight) {
		super();
		Iq = iq;
		this.weight = weight;
	}
	
	public int getIq() {
		return Iq;
	}

	public float getWeight() {
		return weight;
	}
}
class heart{
	int beat;
	float size;
		public heart(int beat, float size) {
		super();
		this.beat = beat;
		this.size = size;
	}
	public int getBeat() {
		return beat;
	}
		public float getSize() {
		return size;
	}
}
class book{
	String name1;
	String author;
	
	public book(String name1, String author) {
		super();
		this.name1 = name1;
		this.author = author;
	}
		public String getName1() {
		return name1;
	}
		public String getAuthor() {
		return author;
	}
	
}
class bike{
	private String name2;
	private int cost;
	
	public bike(String name2, int cost) {
		super();
		this.name2 = name2;
		this.cost = cost;
	}
	
	public String getName2() {
		return name2;
	}
	
	public int getCost() {
		return cost;
	}
}
class human{
	brain b = new brain(100,1198f);
	heart h = new heart(83,9.5f);
}

class student extends human{
	void hasABook(book bo) {
		System.out.println(bo.getName1());
		System.out.println(bo.getAuthor());
	}
	void hasABike(bike bi) {
		System.out.println(bi.getName2());
		System.out.println(bi.getCost());
	}
}
	public class isAhasA1 {

	public static void main(String[] args) {
	
		student st = new student();
		
		book bo = new book("NAME: 2-STATES","AUTHOR: CHETHANBHAGAT");
		bike bi = new bike("NAME: JUPITER COST:",80000);
		System.out.println("STUDENT DETAILS :");
		System.out.println();
		
		System.out.println("BRAIN DETAILS:");
	  System.out.println("IQ:"+st.b.getIq());
	  System.out.println("BRAIN WEIGHT:"+st.b.getWeight());
	  System.out.println();
	  
	  System.out.println("HEART DETAILS:");
	  System.out.println("HEARTBEAT: "+st.h.getBeat());
	  System.out.println("HEART SIZE:"+st.h.getSize());
	  System.out.println();
	  
	  System.out.println("BOOK: ");
	    st.hasABook(bo);
	  System.out.println();
	  
	  System.out.println("BIKE");
		st.hasABike(bi);
	}
}
