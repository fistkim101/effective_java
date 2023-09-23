package item5_new;

import java.util.List;

public class EnglishDictionary implements Dictionary {
    private final List<String> words = List.of("hello");

    @Override
    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
