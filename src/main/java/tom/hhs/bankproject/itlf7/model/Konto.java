package tom.hhs.bankproject.itlf7.model;

public class Konto {

    private double saldo;
    private double dispo;

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