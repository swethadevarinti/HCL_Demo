
class A {

	
	void m1() {
		System.out.println("m1::::::::::parent::::::");
	}
	void m2() {
		System.out.println("m2::::::::::parent::::::");
	}
	void m1(String s) {
		System.out.println("m1::::::::::parent:::111111111:::");
	}
}
	class B extends A{
		
		void m2() {
			System.out.println("m2::::::::::child::::::");
		}
		void m3() {
			System.out.println("m3::::::::::child::::::");
		}
		
			
	}
	
	public class C{
		public static void main(String[] args) {
			
			A a = new A();
			A a1 = new B();
			
			a.m1();
			a.m1("string");
			a.m2();
			
			a1.m2();
			a1.m1();
			
		}
	}
