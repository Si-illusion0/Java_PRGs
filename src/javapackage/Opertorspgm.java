package javapackage;

public class Opertorspgm {

	public static void main(String[] args) {
		// Arithmetic Operators
		System.out.println("Arithmetic Operators");
		int a =5;
		int b =3;
		System.out.println("Addition = "+ (a+b));
		// System.out.println(a+b);
		System.out.println("Substraction = "+ (a-b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("Division = "+ (a/b)); //Quotient value = 1
		System.out.println("Modulus = "+ (a%b)); // Reminder value = 2
		
		//Assignment Operators
		System.out.println("Assignment Operators");
		// a=b; value of b will be assigned to a
		System.out.println(a+=b); // it means a=a+b its updated value of a is 8
		System.out.println(a-=b); // it means a=a-b its update value of a is 8-3 = 5
		
		//Relation Operators output will be boolean values ()true/false
		System.out.println("Relation Operators");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		System.out.println(a==b); // false
		System.out.println(a>b);  // true
		System.out.println(a>=b); // true
		System.out.println(a<b); // false
		System.out.println(a<=b); // false
		System.out.println(a!=b); // true
		
		//Logical Operators
		String uname = "abc";
		String pword = "1234";
		
		System.out.println("AND");
		System.out.println(uname == "abc" && pword == "1234"); // checking both conditions is true
		System.out.println("OR");
		System.out.println(uname == "abc" || pword == "12345"); // checking either one condition is true
		System.out.println("NOT");
		System.out.println(!(uname == "abc"));
		
		// Unary Operators
		System.out.println("Unary Operators");
		//post increment - perform action then increment
		int i=3;
		System.out.println(i); //3
		System.out.println(i++); //3  here the value of 1 print first then perform the action
		System.out.println(i); //4
		
		//Pre increment - increment then perform action
		int j=10;
		System.out.println(++j);
		System.out.println(--j);
		
		//Ternary Operators
		System.out.println("Ternary Operators");
		
		//?, Used for Decision making
		// variable name=condition ? exp1 : exp2;
		// exp1 - print when condition is true    exp2 print when condition is false
		//variable data type depends upon the type of exp
		
		int x=30 , y=40 ;
		String s=x>y ? "x is greater ":"y is greater";
		System.out.println(s);
		
		Boolean s1=x>y ? true:false;
		System.out.println(s1);
	}

}
