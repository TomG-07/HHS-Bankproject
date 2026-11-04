package tom.hhs.bankproject.itlf7.model.bike;

public class MainFahrrad {

    public static void main(String[] args) {

        Fahrrad fahrrad = new Fahrrad();
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
