// Źák je podtřídou třídy Osoba
// Žák proto dědí vlasnoti třídy Osoba a přidává vlastní
//
package škola;

class Žák extends Osoba {
    private String třída;

    public Žák(int věk, Pohlaví po, String třída) {
        super(věk, po);
        this.třída = třída;
    }
    
    // díky polymorfismu přepíšeme metodu z nadřazené třídy
    // a naprogramujeme vlastní výstup
    @Override
    public void představSe() {
        System.out.println("Žák ze třídy "+this.třída+".");
        // použijeme (společný) kód z nadřízené třídy Osoba
        super.představSe();
        System.out.println("Mám prázdniny.");
        System.out.println("");
    }
    
    public boolean máPrázdniny() {
        return true;
    }
}
