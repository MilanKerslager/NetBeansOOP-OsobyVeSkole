// základní třída Osoba
// obsahuje společné vlastnosti pro podtřídy Žák, Učitel, Zaměstnanec
//
package škola;

public class Osoba {

    private int věk;
    private Pohlaví pohlaví;

    public Osoba(int věk, Pohlaví po) {
        this.věk = věk;
        this.pohlaví = po;
    }

    // vypisuje (společné) vlastnosti
    public void představSe() {
        System.out.print("Jsem " + pohlaví + ", ");
        System.out.println("je mi " + this.věk + " let.");
    }
}
