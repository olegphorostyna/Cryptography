public class WordDetectingApp {

    public static void main(String[] args) {
        String englisText = "Great Britain, whose children we are, and whose language we speak, should no longer be our standard; for the taste of her writers is already corrupted, and her language on the decline.";
        LanguageDetector languageDetector = new LanguageDetector();
        System.out.println(languageDetector.isEnglish(englisText));
    }   
}
