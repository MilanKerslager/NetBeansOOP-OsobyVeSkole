// výčtový typ pro pohlaví
//
package škola;

public enum Pohlaví {
    MUŽ,
    ŽENA;

    // pro tisk hodnoty proměnné (implicitní metoda toString())
    public String toString() {
        return name().toLowerCase();
    }

    // alternativní tisk (libovolný řetězec)
    public String toString2(Pohlaví p) {
        switch (p) {
            case ŽENA:
                return ("jsem žena");
            case MUŽ:
                return ("jsem muž");
            default:
                return ("CHYBA");
        }
    }
}
