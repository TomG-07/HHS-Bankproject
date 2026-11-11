package tom.hhs.bankproject.itlf7.model;

public class Konto {

    private double saldo;
    private double dispo;

    public Konto() {
        this(0,0);
    }

    public Konto(double saldo) {
        this(saldo, 0);
    }

    public Konto(double saldo, double dispo) {
        this.saldo = Math.min(saldo, 5000);
        this.dispo = Math.min(dispo, 2 * this.saldo);
    }

    public boolean abheben(double betrag) {
        if (this.saldo + this.dispo >= betrag && betrag > 0) {
            this.saldo -= betrag;
            return true;
        }
        return false;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            this.saldo += betrag;
        }
    }

    public boolean ueberweisen(double betrag, Konto zielKonto) {
        if (this.abheben(betrag)) {
            zielKonto.einzahlen(betrag);
            return true;
        }
        return false;
    }

    public void show() {
        System.out.println("Saldo: " + this.saldo + " Dispo: " + this.dispo);
    }

    public void setDispo(double dispo) {
        if (dispo > 0) {
            this.dispo = dispo;
        }
    }
}