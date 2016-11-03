// Zaměstnanec je podtřídou třídy Osoba
// Zaměstnanec proto dědí vlasnoti třídy Osoba a přidává vlastní
//
package škola;

public class Zaměstnanec extends Osoba {
    public int výplata;

    public Zaměstnanec(int věk, Pohlaví p, int výplata) {
        super(věk, p);
        this.výplata = výplata;
    }
    
    // využití polymorfismu
    @Override
    public void představSe() {
        System.out.println("Zaměstnanec s výplatou "+this.výplata+" Kč.");
        super.představSe();
        System.out.println("Nemám prázdniny.");
        System.out.println("");
    }
}
