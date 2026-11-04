package tom.hhs.bankproject.itlf7.model;

public class Konto {

    private double saldo;
    private double dispo;

    public boolean abheben(double betrag) {
        if (this.saldo + this.dispo >= betrag) {
            this.saldo -= betrag;
            return true;
        }
        return false;
    }

    public void einzahlen(double betrag) {
        this.saldo += betrag;
    }

    public boolean ueberweisen(double betrag, Konto zielKonto) {
        if (this.saldo + this.dispo >= betrag) {
            this.saldo -= betrag;
            zielKonto.saldo +=betrag;
            return true;
        }
        return false;
    }

    public void show(){
        System.out.println("Saldo: " + this.saldo + " Dispo: " + this.dispo);
    }

    public void setDispo(double dispo) {
        if (dispo > 0) {
            this.dispo = dispo;
        }
    }
}