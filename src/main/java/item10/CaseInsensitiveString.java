package item10;

public class CaseInsensitiveString {
    final String value;

    public CaseInsensitiveString(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return value.equalsIgnoreCase(((CaseInsensitiveString) o).value);
        }

        // String 인 경우에도 대소문자 구분 없이 비교를 한다(대칭성을 깨트린다)
        if (o instanceof String) {
            return value.equalsIgnoreCase((String) o);
        }

        return false;
    }

}
