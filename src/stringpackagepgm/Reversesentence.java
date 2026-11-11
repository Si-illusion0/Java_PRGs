package stringpackagepgm;

public class Reversesentence {

	public static void main(String[] args) {
		String s2 = "testing training center";
        String[] word = s2.split(" ");
        String rsentence = "";

        for (int i = word.length - 1; i >= 0; i--) {
        	rsentence += word[i] + (i == 0 ? "" : " ");
        }
        System.out.println(rsentence);

	}

}
