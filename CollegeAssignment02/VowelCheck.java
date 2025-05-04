
public class VowelCheck {
	public static void main(String[] args) {
		String word = "Check";
		String vowels = "aeiouAEIOU";
		boolean hasVowel = false;

		for (int i = 0; i < word.length(); i++) {
			if (vowels.indexOf(word.charAt(i)) != -1) {
				hasVowel = true;
				break;
			}
		}

		if (hasVowel) {
			System.out.println("Contains Vowel");
		} else {
			System.out.println("Does Not Contain Vowel");
		}
	}
}
