package stringpackagepgm;

public class Countofwords {

	public static void main(String[] args) {
		String sen ="Java is simple and easy to learn";
		String res[] =sen.split(" ");
		for(String c:res) {
			System.out.println(c);
		}
		System.out.println("count of words : "+res.length);

		
		// Reverse the sentence
		System.out.println();
		System.out.println("Reverse the sentance");
		
		int index = res.length-1; // to find the last index position

		for(int i=index;i>=0;i--) {
			System.out.print(res[i]+" ");
			
		}
	}

}
