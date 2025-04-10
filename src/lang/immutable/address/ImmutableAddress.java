package lang.immutable.address;

public class ImmutableAddress {

    private final String value; //final처리

    public ImmutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() { //setter 제거
        return value;
    }

}
