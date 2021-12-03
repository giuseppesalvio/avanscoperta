public enum Score {
    ZERO("0"),
    LOVE("LOVE");

    private final String valore;

    Score(String valore) {
        this.valore = valore;
    }

    public static Score from(String valore) {
        if(valore==ZERO.valore){
            return ZERO;
        }
        if(valore==LOVE.valore){
            return LOVE;
        }
        return null;
    }
}
