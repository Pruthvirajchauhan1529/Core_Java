package InnerClasses.Anonymous;

class PopCorn{
	public void taste(){
		System.out.println("Salty");
	}
}
class AnonyCase1{
	public static void main(String[] args) {
		PopCorn p1 = new PopCorn(){
			public void taste(){
				System.out.println("Spicy");
			}
		};
		p1.taste();//spicy 

		PopCorn p2 = new PopCorn();
		p2.taste();//salty

		PopCorn p3 = new PopCorn(){
			public void taste(){
				System.out.println("Sweet");
			}
		};
		p3.taste();//sweet

		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		System.out.println(p3.getClass().getName());
	}
}