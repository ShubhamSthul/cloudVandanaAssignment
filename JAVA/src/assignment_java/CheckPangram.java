
//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//  from a-z) 
package assignment_java;

public class CheckPangram {
	
	public static boolean isPangram(String sentence) {
		sentence = sentence.toLowerCase();
		
		//check that sentence contains all letter
		boolean[] chars = new boolean[26];
		
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if(c>='a' && c<='z') {
				chars[c-'a'] = true;
			}
		}
		for(boolean letter : chars) {
			if(!letter) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs.";
        if(isPangram(s)) {
        	System.out.println("Is a Pangram");
        }
        else {
        	System.out.println("Is Not a Pangram");
        }
	}

}
