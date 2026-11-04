package tom.hhs.bankproject.itlf7.model;

import java.util.Random;

public class Schalter {

    public static void main(String[] args) {


        Konto alex = new Konto();
        Konto bernd = new Konto();
        Konto anna = alex;

        System.out.println(anna.equals(alex));

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



    }
}
