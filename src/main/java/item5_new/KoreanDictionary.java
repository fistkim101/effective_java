package item5_new;

import java.util.List;

public class KoreanDictionary implements Dictionary {
    private final List<String> words = List.of("안녕");

    @Override
    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
