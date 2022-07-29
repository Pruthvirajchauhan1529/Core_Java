package Polymorphism.Overriding;

class p{
	int x = 888;
}
class c extends p{
	int x = 999;
}
class Demo{
	public static void main(String[] args) {
		p p=new p();
		System.out.println(p.x);
		c c = new c();
		System.out.println(c.x);
		p p1 = new p();
		System.out.println(p1.x);

	}
}