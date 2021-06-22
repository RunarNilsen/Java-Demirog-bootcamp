package javaBootcamp;

public class javaExampleVowelOrNot {
	public static void main(String[] args) {
		
		String word="I";
		String[] thinVowel = {"e", "ö", "i", "ü"};
		String[] boldVowel = {"a", "o", "u"};
		
		System.out.println(word.toLowerCase());
		
		if(thinVowel.toString().contains(word.toLowerCase())) {
			System.out.println("This word is a thin vowel");
			
		}else if(boldVowel.toString().contains(word.toLowerCase())) {
			System.out.println("This word is a bold vowel");
		}else {
			System.out.println("This word is NOT a vowel");
		}
		
		
		
		
		
		
	}
	

}
