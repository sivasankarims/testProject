
interface interFace {
		void print();
		void mom();
}



public class interfaceExample implements interFace{
	public void print(){
		System.out.println("Hi");
		System.out.println("Hi2");
	}

	public static void main (String args[]){
		interFace obj = new interfaceExample();
		obj.print();
		obj.mom();
		
	}
	
public  void mom(){
	System.out.println("Hello");
}
			
	
}
