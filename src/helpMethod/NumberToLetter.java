package helpMethod;

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

    public int getValue() {
        return value;
    }

    public static String getStringFromValue(int value) {
        for (NumberToLetter enumValue : NumberToLetter.values()) {
            if (enumValue.value == value) {
                return enumValue.name(); // Alebo tu vráťte reťazec, ktorý chcete mať priradený k hodnote
            }
        }
        return null; // Alebo nejaký defaultný reťazec, ak sa hodnota nenájde
    }
}
