package basics;

public class StringDemoTest {
	
	/*
	 * String:
	 * - is a class
	 * - it is a non primitive datatype
	 * - sequence of character
	 * 
	 * Rules:
	 * 1. String literal
	 * 2. new keyword
	 */
	

	public static void main(String[] args) {
		
		String name; // declaration of variable
		name = "Guru C"; // assignment of variable
		System.out.println(name);
		
//		String n = new String ("Hello");
//		System.out.println(n);
		
		String msg = "Hello";
		System.out.println(msg);
		msg = msg.concat(" world");
		System.out.println(msg);
		
		// String literals
		String l1 = "Java";
			System.out.println(l1.hashCode());
		String l2 = "Python";
			System.out.println(l2.hashCode());
		String l3 = "TypeScript";
			System.out.println(l3.hashCode());
		String l4 = "TypeScript1";
			System.out.println(l4.hashCode());
		
		// we are learning Java 2. Identify the length 3. Print each character of string using for loop
		String msg1 = "We are learning ";
		msg1 = msg1.concat(l1);
		System.out.println(msg1);
//		int length = msg1.length();
//		System.out.println("Length of msg1 string is :"+ length);
		System.out.println(msg1.length());
		
		System.out.println(msg1.contains("are "));
		
		// string methods: endswith, indexOf, lastIndexOf, charAt, 
		
//		for (int i=0; i< msg1.length(); i++) {
//			System.out.println(msg1.charAt(i));
//		}
		
		// new keyword
		
		String n1 = new String("ABC ");
		String n2 = new String("DEF ");
		String n3 = new String("GHI");
		String n4 = new String("GHI");
		
		System.out.println(n1 +n2 +n3);
		
		// String comparison
		if (n1 == n2)  // checking the location of the object
		{
			System.out.println("n values are same");
		}
		else if (n3 == n4)
		{
			System.out.println("n values are same"); // NOT working, as it is checking memory allocation location
		}
		else if (n3.equals(n4))
		{
			System.out.println("n values are same as it is by comparison"); // Working - // equals method is matching char vs char in both string
		}
		

	}

}
