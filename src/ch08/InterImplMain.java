package ch08;

public class InterImplMain {

	public static void main(String[] args) {
//		ImplClass impl = new ImplClass();
//		impl.method1();
//		impl.method2();
		ImplClassChild implChild = new ImplClassChild();
		implChild.method1();
		implChild.method2();
		implChild.method3();
	}

}
