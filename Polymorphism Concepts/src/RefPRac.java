

public class RefPRac {
   private int i=1;
	private class ABC{
		 public void display() {
			System.out.println("Displaying from public class");
		}
		
	}
	void fun() {
		new ABC().display();
	}
	
	public static void main(String[] args) {
		
		
		RefPRac name = new RefPRac();
//		name.fun();
		System.out.println(name.i);
		ABC n1 = name.new ABC();
		n1.display();
//		RefPRac.ABC nestedObject = new RefPRac.ABC();
          
		
		
	}
}
