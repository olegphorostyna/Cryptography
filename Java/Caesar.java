class Caesar{  
    public static void main(String args[]){ 
		String text = "Simple test message";
		CaesarCipher cipher  = new CaesarCipher();
		String cipherText = cipher.encrypt(text,3);
		System.out.println(cipherText);
		System.out.println('\n');
		System.out.println(cipher.decrypt(cipherText,3));      
    }  
}  