package utils;

public enum Numbers {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("FIVE"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9");

    private final String number;

    Numbers(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
