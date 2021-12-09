
import java.lang.reflect.*;



class Menu {
	int a, b, c;
	long d, e;
	String myname = "nikhil";

	Menu() {

	}

	Menu(int x) {
		this.a = x;
	}

	private void display() {
		System.out.println("Display function from display");
	}
}

public class ReflectionPrac {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("Menu");
		System.out.println("Class name :" + c.getName());
		Field f[] = c.getDeclaredFields();
		Method m[] = c.getDeclaredMethods();
		// Constructor con[]=c.getDeclaredConstructors();
		Constructor con[] = c.getDeclaredConstructors();
		System.out.println("Total Variable");
		for (Field field : f) {
			System.out.println(field);
		}
		System.out.println("Method Details");
		for (Method method : m) {
			System.out.println(method);
		}
		System.out.println("Constructor Details");
		for (Constructor constructor : con) {
			System.out.println(constructor);
		}
		System.out.println(c.isInterface()); // if it is interface

//		   Way to Access the private member function Of the class

		Object o = c.newInstance();
		Method m1 = c.getDeclaredMethod("display");
		m1.setAccessible(true);
		m1.invoke(o);

	}

}
