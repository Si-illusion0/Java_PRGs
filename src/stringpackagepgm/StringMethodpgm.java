package stringpackagepgm;

public class StringMethodpgm {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="Hello";
		String s3=new String("Hello");
//		if(s2==s3) //the result will be false because '==' comparing the refe
//		{
//			System.out.println("Values are equal");
//		}
//		else
//		{
//			System.out.println("Values are not equal");
//		}
		//equals()
		if(s2.equals(s3))
		{
			System.out.println("Values are equal");
		}
		else
		{
			System.out.println("Values are not equal");
		}

		//equalsIgnoreCase() //verify the actual values,not consider the cases
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Values are equal");
		}
		else
		{
			System.out.println("Values are not equal");
		}

		//concat()
		String s4="World";
		System.out.println(s1.concat(s4)); //HelloWorld

		//contains()
		System.out.println(s4.contains("Wo")); //true

		//toUpperCase()
		System.out.println(s1.toUpperCase()); //HELLO

		//toLowerCase()
		System.out.println(s1.toLowerCase()); //hello

		//length()
		System.out.println(s1.length());
		
		//trim() - to remove the white space from starting and ending
		String s5=" Hello ";
		System.out.println("Before trim :"+s5);
		System.out.println("After trim :"+s5.trim());
		
		//startsWith() - to check whether the word start with a specific word
		String s6="Hello everyone good morning";
		System.out.println(s6.startsWith("Hello"));
		System.out.println(s6.endsWith("morning"));
		
		//charAt(index position) - 
		System.out.println(s6.charAt(2));
		
		//substring(start index , end index) - 
		System.out.println(s6.substring(6,12)); //will not print the value at end index
		
		//split() - to split a sentence up on a condition
		String [] res= s6.split(" ");
//		String [] res= s6.split("e");
//		System.out.println("the result after split");
		for(String v:res) {
			System.out.println(v);
		}
		
		System.out.println("No of words = "+res.length); // to find the no of words
		
		//tocharArray() - to retrieve as a single character from a string
		String s7="Siva Sankar";
		char [] ar=s7.toCharArray();
		System.out.println("Result of char array");
		for (char c:ar) {
			System.out.println(c);
		}
		
		//replace() - to replace a specific word from a sentence
		//s6="Hello everyone good morning"
		
		System.out.println(s6.replace("Hello","Hi"));//
		
		
	}
	

}
