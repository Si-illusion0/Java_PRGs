package iterativestatements;

public class Whiletrueprg {

	public static void main(String[] args) {
		int i=1;
		while(true) { //executing while loop without giving any conditions
			System.out.println(i);
			i++;
			if(i==5) {
				break; // to terminate the execution of the loop
			}
		}

	}

}
