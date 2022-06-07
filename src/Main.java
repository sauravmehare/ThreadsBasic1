
public class Main {

	public static void main(String[] args) {
		
		for(int i=0; i<=10 ; i++) {
			System.out.println("Main "+i);
		}
		A a = new A();
		B b = new B();
		a.start();
		b.start();
		
		for(int i=0; i<=10 ; i++) {
			System.out.println("Main2 "+i);
		}

	}

}
