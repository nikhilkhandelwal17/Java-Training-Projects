@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
	
}

@SmartPhone(os="Android",version = 6)
class Nokia{
	String model;
	int size;
	
	
	public Nokia(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
}


public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Nokia obj = new Nokia("Fire",10);
        
	}

}
