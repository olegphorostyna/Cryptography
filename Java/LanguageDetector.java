import java.io.File;
import java.util.List;

public class LanguageDetector {
    private FileProcessor fileProcessor;
    private List<String> englishWords;

    public LanguageDetector() {
        this.fileProcessor = new FileProcessor();
        this.englishWords = fileProcessor.getWords();
    }

    private int countEnglichWordsInText(String text){
        text = text.toUpperCase();
        String[] words = text.split(" ");
        int matches = 0;
        for (String s: words){
            if(englishWords.contains((s))){
                matches++;
            }
        }
        return matches;
    }

    public boolean isEnglish(String text){
        int matches = countEnglichWordsInText(text);
        if((float)matches/text.split(" ").length * 100>=60){
            return true;
        }else return false;
    }
}
