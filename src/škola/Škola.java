// ve škole jsou tři typy osob: žáci, učitelé a zaměstnanci (školník)
// Využijte dědičnost tříd pro definování osob
// napište metody představSe(), která popíše objekt a využijte polymorfismus
//
package škola;

public class Škola {

    public static void main(String[] args) {
        // žák(věk,pohlaví,třída,prázdniny)
        Žák z1 = new Žák(15, Pohlaví.ŽENA, "E1");
        z1.představSe();

        Učitel u1 = new Učitel(44, Pohlaví.MUŽ, 19000);
        u1.představSe();

        Zaměstnanec za1 = new Zaměstnanec(55, Pohlaví.MUŽ, 16000);
        za1.představSe();
    }
}
