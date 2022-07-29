package InnerClasses.Anonymous;

class AnonyThreadArgs{
	public static void main(String[] args) {
		new Thread(new Runnable()
				{
					public void run(){
						for (int i=0; i<10; i++) {
							System.out.println("Child Thread");
						}
					}
				}).start();
		for (int j=0; j<10; j++ ) {
			System.out.println("Main Thread");
		}
	}
}