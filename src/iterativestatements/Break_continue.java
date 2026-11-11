package iterativestatements;

public class Break_continue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) 
		{
			if(i==5) 
			{
				//break; //to terminate the execution
				continue; // continue further execution
			}
			System.out.println(i);
		}

	}

}
