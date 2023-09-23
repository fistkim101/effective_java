package item5;

public class SpellChecker {
    private final Dictionary dictionary = new Dictionary();

    public boolean isCorrectWord(String word) {
        return dictionary.contains(word);
    }

}
