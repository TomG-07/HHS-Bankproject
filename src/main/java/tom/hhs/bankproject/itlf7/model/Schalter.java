package tom.hhs.bankproject.itlf7.model;

import java.util.Random;

public class Schalter {

    public static void main(String[] args) {


        Konto alex = new Konto();
        Konto bernd = new Konto();

        // alex.setSaldo(200d);
        // bernd.setSaldo(alex.getSaldo()*2);
        // alex.setSaldo(alex.getSaldo()*5);

        // int zufall = new Random().nextInt(9);

        // bernd.setSaldo(bernd.getSaldo()*zufall);

        // if (bernd.getSaldo() > alex.getSaldo()) {
        //     System.out.println("Bernd hat mehr Geld als Alex");
        // } else if (bernd.getSaldo() < alex.getSaldo()) {
        //     System.out.println("Alex hat mehr Geld als Bernd");
        // } else {
        //     System.out.println("Beide haben gleich viel Geld");
        // }

        alex.einzahlen(5000);
        alex.abheben(2000);
        alex.setDispo(200);
        alex.ueberweisen(3200, bernd);
        System.out.println("Alex");
        alex.show();
        System.out.println("Bernd");
        bernd.show();

    }
}
