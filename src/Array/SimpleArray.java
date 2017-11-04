package Array;

public class SimpleArray {

	public static void main(String[] args) {
		
		String family[] = new String[4];
		
		family[0] = "Shriram";
		family[1] = "Sivasankari";
		family[2] = "Shrisha";
		family[3] = "Shashank";
		
		
		System.out.println("Family memebers are "+family[0]+", "+family[1]+", "+family[2]+", "+family[3]);
		
		int sizeofFamily = family.length;
		
		System.out.println("The size of the family is "+sizeofFamily);
		
		for (int i = 0; i < family.length; i++) {
			System.out.println(+i + ") "+ family[i]);
			
			if (family[i].equals("Shriram")) {
				//break;
				
			}
		}
		

	}

}
