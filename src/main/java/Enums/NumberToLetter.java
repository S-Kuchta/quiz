package Enums;

public enum NumberToLetter {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5);

    private final int value;

    NumberToLetter(int value) {
        this.value = value;
    }

    public static String getStringFromValue(int value) {
        for (NumberToLetter enumValue : NumberToLetter.values()) {
            if (enumValue.value == value) {
                return enumValue.name();
            }
        }
        return null;
    }
}
