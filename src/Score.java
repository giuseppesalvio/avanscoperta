import java.util.Objects;

public enum Score {
    ZERO("0"),
    LOVE("LOVE"),
    QUINDICI("15"),
    TRENTA("30"),
    QUARANTA("40");

    private final String valore;

    Score(String valore) {
        this.valore = valore;
    }

    public static Score from(String valore) {
        if (Objects.equals(valore, ZERO.valore)) {
            return ZERO;
        }
        if (Objects.equals(valore, LOVE.valore)) {
            return LOVE;
        }
        if (Objects.equals(valore, QUINDICI.valore)) {
            return QUINDICI;
        }
        if (Objects.equals(valore, TRENTA.valore)) {
            return TRENTA;
        }
        if (Objects.equals(valore, QUARANTA.valore)) {
            return QUARANTA;
        }
        return null;
    }
}
