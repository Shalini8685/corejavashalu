/**
 * 
 */
package oops;

/**
 * @author Shalini
 *
 */
//COMPOSITE OBJECT
class heart{
	private int beat;
	private double size;
	
	public heart(int beat, double size) {
		super();
		this.beat = beat;
		this.size = size;
	}
	
	public int getBeat() {
		return beat;
	}

	
	public double getSize() {
		return size;
	}
		}

//AGGREGATE OBJECT
class book{
	private String author;
	private String name;
	
	public book(String author, String name) {
		super();
		this.author = author;
		this.name = name;
	}
		public String getAuthor() {
		return author;
	}
		public String getName() {
		return name;
	}
}
//MAIN OBJECT
class Student{
	heart h = new heart(83, 9.5);
	
	void hasABook(book b) {
		System.out.println(b.getAuthor());
		System.out.println(b.getName());
	}
	
}
public class hasA1 {
	public static void main(String[] args) {
		
		Student s = new Student();
		book b = new book("CHETHAN BHAGAT", "2-STATES");
		
		System.out.println("DETAILS OF STUDENT HEART:");
		System.out.println(s.h.getBeat());
		System.out.println(s.h.getSize());
		System.out.println();
		System.out.println("DETAILS OF STUDENT BOOK:");
		s.hasABook(b);
				
		s=null;
//		System.out.println(s.h.getBeat());
//		System.out.println(s.h.getSize());
//		System.out.println(b.getAuthor());
//		System.out.println(b.getName());
			}
}
