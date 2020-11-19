
public class StaticMethodsDemo {

	public static void main(String[] args) {

		System.out.println("Inside Main 1");
		StaticMethodsDemo.method1();
		System.out.println("Inside Main 2 ");
		
	}

	static void method1() {
		System.out.println("Inside Method 1");
	}

	static {
		System.out.println("Inside the static block");
		StaticMethodsDemo.method1();
	}

}
