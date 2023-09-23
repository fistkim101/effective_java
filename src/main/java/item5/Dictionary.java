package item5;

import java.util.List;

public class Dictionary {

    private final List<String> words = List.of("hello");

    public boolean contains(String word) {
        return this.words.contains(word);
    }

}
