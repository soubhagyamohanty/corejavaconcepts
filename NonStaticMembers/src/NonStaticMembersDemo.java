
public class NonStaticMembersDemo {

	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside the contructor");
	}

	{
		System.out.println("Inside the nonstatic block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		obj.doSomething();
		//new NonStaticMembersDemo();
		//new NonStaticMembersDemo();
	}

	static {
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		System.out.println("Inside doSomething");
	}

}
