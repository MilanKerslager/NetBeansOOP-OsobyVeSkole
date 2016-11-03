// Učitel je podtřídou třídy Osoba
// Učitel proto dědí vlasnoti třídy Osoba a přidává vlastní
//
package škola;

public class Učitel extends Osoba {
    private int výplata;

    public Učitel(int věk, Pohlaví po, int výplata) {
        super(věk, po);
        this.výplata = výplata;
    }
    
    // využití polymorfismu
    @Override
    public void představSe() {
        System.out.println("Učitel s výplatou "+this.výplata+" Kč.");
        super.představSe();
        System.out.println("Mám prázdniny.");
        System.out.println("");
    }
}
