package item5_new;

public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isCorrectWord(String word) {
        return dictionary.contains(word);
    }
}
