public class CaesarCipher{
private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private LanguageDetector languageDetector = new LanguageDetector();

public String encrypt(String plainText, int key){
	String cipherText="";
	plainText=plainText.toUpperCase();
	
	for (int i=0;i<plainText.length();i++){
		char character = plainText.charAt(i);
		int charIndex = ALPHABET.indexOf(character);
		int encryptedIndex = (charIndex+key) % ALPHABET.length();
		cipherText+=ALPHABET.charAt(encryptedIndex);	
		
	}
	return cipherText;
}


public String decrypt(String cipherText){	
	for(int key = 0; key<ALPHABET.length();key++){
			String plainText="";	
		for (int i=0;i<cipherText.length();i++){
			char character = cipherText.charAt(i);
			int charIndex = ALPHABET.indexOf(character);
			int decryptedIndex = Math.floorMod((charIndex-key), ALPHABET.length());
			plainText+=ALPHABET.charAt(decryptedIndex);			
		}
		if(languageDetector.isEnglish(plainText)){
			return plainText;
		}		
	}
	return null;
	
}


}