package LearnJava;

public class classObjMethods {
	
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classObjMethods obj1 = new classObjMethods();
		obj1.add();
		//classObjMethods obj2 = new classObjMethods();
		//obj2.add();
		System.out.println("a value is "+obj1.a);
		

	}
	
	public  void add() {
		int x=100;
		int y=200;
		int z=x+y;
		System.out.println("The sum of two numbers is "+z);
		
	}
	

}
