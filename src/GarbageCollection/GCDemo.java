package GarbageCollection;

class GCDemo{

	// GCDemo(){
	// 	System.out.println(this + " Created");
	// }
	// public static void main(String[] args) {
			
	// 	new GCDemo();
	// 	new GCDemo();
	// }

	// protected void finalize(){
	// 	System.out.println(this+ "Finalize");
	// }

	int objId;
	GCDemo(int objId){
		this.objId = objId;
		System.out.println("Create : "+this.objId);
	}
	public static void main(String[] args) {
		
		new GCDemo(1); new GCDemo(2); for (int i=1; i<=100;i++ ) { System.gc(); } }

	protected void finalize(){
		System.out.println("Finalized : "+objId);
	}
}