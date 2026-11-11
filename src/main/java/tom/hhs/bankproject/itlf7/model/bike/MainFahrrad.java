package tom.hhs.bankproject.itlf7.model.bike;

public class MainFahrrad {

    public static void main(String[] args) {

        Fahrrad fahrrad = new Fahrrad("cube", 3, 10, 5);
        Fahrrad rad = new Fahrrad();
        Fahrrad radel = new Fahrrad("pegasus");

        fahrrad.setMarke("Rose");

        System.out.println("Ursprüngliches Fahrrad: ");
        fahrrad.anzeigen();
        System.out.println("\n");
        fahrrad.gangWechseln(2);
        fahrrad.beschleunigen(100);
        fahrrad.bremsen(-20);
        fahrrad.anzeigen();

    }
}
