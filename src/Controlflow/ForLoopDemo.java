package Controlflow;

class ForLoopDemo{
	public static void main(String[] args) {
		int i =1;
		for(i=1;i<=20;i++){

			System.out.print(i+" ");
			if(i==10){
				break;
			}
		}
		System.out.println();
		for(int j=20;j>=1;j--){
			if(j==10){
				break;
			}
			System.out.print(j+" ");
		}
	}
}