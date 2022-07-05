class Child extends Parent{
	
	int x =30;
	
	public static void m1() {
		System.out.println("In child");
	}
	
	public static void main(String[] args) {
		// TODO Parentuto-generated method stuChild
		
		
		Child c = new Child();
		System.out.println(c.x);//30
		c.m1();
		Parent p = new Parent();
		System.out.println(p.x);//20
		p.m1();

		Parent p2 = new Child();

		System.out.println(p2.x);//30
		p2.m1();
	}
}