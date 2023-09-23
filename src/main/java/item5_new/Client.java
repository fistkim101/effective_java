package item5_new;

public class Client {
    public static void main(String[] args) {
        Dictionary koDictionary = new KoreanDictionary();
        Dictionary enDictionary = new EnglishDictionary();

        SpellChecker koSpellChecker = new SpellChecker(koDictionary);
        System.out.println(koSpellChecker.isCorrectWord("안녕"));

        SpellChecker enSpellChecker = new SpellChecker(enDictionary);
        System.out.println(enSpellChecker.isCorrectWord("hello"));
    }
}
