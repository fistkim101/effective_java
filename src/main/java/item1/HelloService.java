package item1;

public interface HelloService {
    void sayHello();

    static HelloService of(String language) {
        if ("ko".equals(language)) {
            return new KoreanHelloService();
        } else if ("eng".equals(language)) {
            return new EnglishHelloService();
        }

        throw new IllegalArgumentException("unsupported language");
    }
}
