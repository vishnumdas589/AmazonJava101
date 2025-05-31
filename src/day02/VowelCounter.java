package day02;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello World! Programming is ffun";
		int vowels =0 ;
		int consonants =0;
		int n = text.length();
		text.toLowerCase();
		
		for (int i =0 ;i < n; i++ ) {
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if(text.charAt(i) == 'a' || text.charAt(i) == 'e' ||text.charAt(i) == 'i'|| text.charAt(i) == 'o'||text.charAt(i) == 'u') {
					vowels++;
				}else {
					consonants++;
				}
				
			}else {
				continue;
			}
		}
		System.out.println("vowels = "+ vowels );
		System.out.println("Consonants = "+ consonants );
	}	
}
