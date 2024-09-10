package utils;

public enum Operations {
    plusButton("+"),
    minusButton("-"),
    multiplyButton("*"),
    divideButton("/");

    private final String sign;

    Operations(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
